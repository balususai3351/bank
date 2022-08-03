import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Registering driver....");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("driver registered...");
			System.out.println("trying to connect to the db");
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
			System.out.println("connected to the Db: "+conn);
			System.out.println("trying to make a prepared statement");
			PreparedStatement pst =conn.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?);");
			
			System.out.println("prepared statement is created..");
	         Scanner sc1=new Scanner(System.in);
	         int eno=sc1.nextInt();
	         Statement statement =conn.createStatement();
	         ResultSet rs=statement.executeQuery("select * from employee where EMPNO="+eno);
	         if(rs.next()) {
	        	 
	 			EmployeeAlreadyExistException eaep=new EmployeeAlreadyExistException("employee already existed");
	 			throw eaep;
	         }
	         
	         
	         Scanner sc2=new Scanner(System.in);
	         String ename=sc2.next();
	         Scanner sc3=new Scanner(System.in);
	         int salary=sc3.nextInt();
	         
			pst.setInt(1, eno);
			pst.setString(2, ename);
			pst.setInt(3, salary);
			System.out.println("trying to execute prepared statement ");
			int rows=pst.executeUpdate();
			
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
