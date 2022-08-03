import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class studentUpdate {

	public static void main(String[] args) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		try {
			System.out.println("Registering driver....");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("driver registered...");
			System.out.println("trying to connect to the db");
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
			System.out.println("connected to the Db: "+conn);
			System.out.println("trying to make a prepared statement");
			PreparedStatement pst =conn.prepareStatement("UPDATE STUDENT SET NAME=?,BIRTHDAY=?,PHYSICS=?,CHEMISTRY=?,MATHS=? WHERE ROLLNO=?;");
			
			System.out.println("prepared statement is created..");
	         Scanner sc1=new Scanner(System.in);
	         System.out.println("enter rollno");
	         int rno=sc1.nextInt();
	         Statement statement =conn.createStatement();
	         ResultSet rs=statement.executeQuery("select * from STUDENT where ROLLNO="+rno);
	         if(!rs.next()) {
	        	 
	 			EmployeeNotFoundException snf=new EmployeeNotFoundException("STUDENT not existed");
	 			throw snf;
	         }
	         else {
	        	 System.out.println("enter name of the student");
		         Scanner sc3=new Scanner(System.in);
		         String sname=sc3.nextLine();
		         System.out.println("enter day month and year in year-month-day format");
		         Scanner sc4=new Scanner(System.in);
		         String Date=sc4.nextLine();
		         while(Date.charAt(4)!='-' && Date.charAt(7)!='-') {
		        	 System.out.println("enter ur birthday at correct format");
		        	 System.out.println("enter again");
		        	 Date=sc4.nextLine(); 
		         }
		         System.out.println("enter day physics score");
		         Scanner sc5=new Scanner(System.in);
		         int physics=sc5.nextInt();
		         System.out.println("enter day chemistry score");
		         Scanner sc6=new Scanner(System.in);
		         int chemistry=sc6.nextInt();
		         System.out.println("enter day maths score");
		         Scanner sc7=new Scanner(System.in);
		         int maths=sc7.nextInt();
		         
		         pst.setInt(6, rno);
				pst.setString(1, sname);
				pst.setString(2, Date);
				pst.setInt(3, physics);
				pst.setInt(4, chemistry);
				pst.setInt(5, maths);
				System.out.println("trying to execute prepared statement ");
				int rows=pst.executeUpdate();
				System.out.println("");
				 
	         }
	        
	        
	         
	         
	        	 
	        	 
	        
	         
	         
			pst.setInt(1, rno);
			
			System.out.println("trying to execute prepared statement ");
			int rows=pst.executeUpdate();
			
			
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
