import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectWhereTest {

	public static void main(String[] args) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		try {
			System.out.println("Registering driver....");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("driver registered...");
			System.out.println("trying to connect to the db");
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
			System.out.println("connected to the Db: "+conn);
			System.out.println("trying to make a statement");
			java.sql.Statement statement =conn.createStatement();
			System.out.println("trying to execute statement");
			System.out.println("enter the number");
			Scanner scan=new Scanner(System.in);
			int eno=scan.nextInt();
			ResultSet rs=statement.executeQuery("SELECT * FROM EMPLOYEE WHERE EMPNO="+eno);
			if(rs.next()) {
				int empno=rs.getInt(1);
				String ename=rs.getString(2);
				int sal=rs.getInt(3);
				System.out.println("EMP NO: "+empno);
				System.out.println("EMP NAME: "+ename);
				System.out.println("EMP SAL: "+sal);
			}else {
				EmployeeNotFoundException enf=new EmployeeNotFoundException("employee number not found");
				throw enf;
			}
			rs.close();
			statement.close();
			conn.close();
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
}
}