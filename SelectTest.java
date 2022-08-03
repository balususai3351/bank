import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
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
			ResultSet rs=statement.executeQuery("SELECT * FROM EMPLOYEE");
			System.out.println("ststement executed, got the result.....");
			while(rs.next()) {
				int empno=rs.getInt(1);
				String ename=rs.getString(2);
				int sal=rs.getInt(3);
				System.out.println("EMP NO: "+empno);
				System.out.println("EMP NAME: "+ename);
				System.out.println("EMP SAL: "+sal);
				System.out.println("------------------------------------");
			}
			rs.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
