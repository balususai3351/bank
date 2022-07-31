
public class BloodyFool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user u1=new user(88947);
		user u2=new user(null, null);
		user u3 = u2.signupWithEmail("rohan@");
		user u=u1.signupWithEmail("sai@1234");
		
		System.out.println(u1);
		System.out.println(u1.hashCode());
	}
}

class user{
	String username;
	String password;
	String email;
	long phoneno;
	public user(String username, String password, String email, long phoneno) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
	}

	public user(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public user(String email) {
		super();
		System.out.println("u aresinging up with email");
		this.email = email;
	}
//	@Override
//	public String toString() {
//		return "user [username=" + username + ", password=" + password + ", email=" + email + ", phoneno=" + phoneno
//				+ "]";
//	}
	public user(long phoneno) {
		super();
		System.out.println("u rae sining up with phone no");
		this.phoneno = phoneno;
	}
	user signupWithEmail(String email) {
		return new user(email);
	}
	
	user singupWithphoneno(long phoneno) {
		return  new user(phoneno);
	}
	user normalsignup(String username, String password) {
		return new user(username,password);
		
	}
	user completesignup(String username,String password,String email,Long phoneno) {
		return new user(username,password,email,phoneno);
	}
}

