
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User(12,"mohan","mohan@123",9177333733l,"sai@123");
		u1.login();
		u1.myData();
		u1.logout();
        User u2 =new User("mohan@1234");
        u2.login();
        System.out.println("the first object u1 is "+u1);
	}

}
class User{
	int Uid;
	String Uname;
	String password;
	long phoneno;
	String email;
   User(int Uid,String Uname,String password,long phoneno,String email)
   
   
   {
	 this.Uid=Uid;
	 this.Uname=Uname;
	 this.password=password;
	 this.phoneno=phoneno;
	 this.email=email;
	 System.out.println("u signed in");
 }
	User(int Uid,String password){
		this.Uid=Uid;
		this.password=password;
		System.out.println("u r signed in using user id and password");
	}
	User(long phoneno){
		this.phoneno=phoneno;
		System.out.println("u signed in using phoneno");
	}
	User(String email){
		this.email=email;
		System.out.println("u signed in using email");
	}
	void login() {
		System.out.println("u r sucessfully logged in");
	}
	void logout() {
		System.out.println("u r successfully logged out");
	}
	void myData() {
		System.out.println("this is ur data");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "user id is "+Uid+" user name is "+Uname+" password is "+password;
	}
	
	
	
}


