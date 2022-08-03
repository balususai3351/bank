import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDelete {
	public static void main(String[] args) throws EmployeeNotFoundException {
		try {
			System.out.println("Registering driver....");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("driver registered...");
			System.out.println("trying to connect to the db");
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
			System.out.println("connected to the Db: "+conn);
			
	         Scanner sc1=new Scanner(System.in);
	         int rno=sc1.nextInt();
	         Statement statement =conn.createStatement();
	         ResultSet rs=statement.executeQuery("select * from STUDENT where ROLLNO="+rno);
	         if(rs.next()) {
	        	 System.out.println("trying to make a prepared statement");
	     		PreparedStatement pst =conn.prepareStatement("DELETE FROM STUDENT  WHERE ROLLNO=?;");
	     		
	     		System.out.println("prepared statement is created..");
	        
		         
				pst.setInt(1, rno);
				
				System.out.println("trying to execute prepared statement ");
				int rows=pst.executeUpdate();
				System.out.println("");
				 
	 			
	         }
	         else{
	        	 EmployeeNotFoundException ef=new EmployeeNotFoundException("student not existed");
		 			throw ef;
		 			
	         }
	        	 

		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}
