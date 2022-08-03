import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSelect {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
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
				ResultSet rs=statement.executeQuery("SELECT * FROM STUDENT");
				System.out.println("ststement executed, got the result.....");
				while(rs.next()) {
					int rno=rs.getInt(1);
					String sname=rs.getString(2);
					String date=rs.getString(3);
					int pysics=rs.getInt(4);
					int chemistry=rs.getInt(5);
					int maths=rs.getInt(6);
					
					System.out.println("STU NO: "+rno);
					System.out.println("STU NAME: "+sname);
					System.out.println("BIRTHDAY : "+date);
					System.out.println("physics marks"+pysics);
					System.out.println("chemistry marks"+chemistry);
					System.out.println("maths marks"+maths);
					
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
