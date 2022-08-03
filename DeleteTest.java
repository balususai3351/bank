import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;
public class DeleteTest {
 public static void main(String[] args) throws EmployeeNotFoundException {
	try {
		System.out.println("Registering driver....");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("driver registered...");
		System.out.println("trying to connect to the db");
		Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
		System.out.println("connected to the Db: "+conn);
		
         Scanner sc1=new Scanner(System.in);
         int eno=sc1.nextInt();
         Statement statement =conn.createStatement();
         ResultSet rs=statement.executeQuery("select * from employee where EMPNO="+eno);
         if(rs.next()) {
        	 System.out.println("trying to make a prepared statement");
     		PreparedStatement pst =conn.prepareStatement("DELETE FROM EMPLOYEE  WHERE EMPNO=?;");
     		
     		System.out.println("prepared statement is created..");
        
	         
			pst.setInt(1, eno);
			
			System.out.println("trying to execute prepared statement ");
			int rows=pst.executeUpdate();
			System.out.println("");
			 
 			
         }
         else{
        	 EmployeeNotFoundException ef=new EmployeeNotFoundException("employee not existed");
	 			throw ef;
	 			
         }
        	 
         
         
        
		rs.close();
		conn.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}}

