
public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chat c1=new chat();
		chat c2=new chat();
		c1.setCredentials("fy" ,"mohan", "mohan123");
		c2.setCredentials("ms23","siva", "sivan123");
		c1.viewCredentials();
		c2.viewCredentials();
		c1.sendMessage(c2,"hi how are you");
		System.out.println(c2.Rmessage);
		c1.changepassword("mohan123","mohan12");
		System.out.println(c1.password);

	}

}
 class chat{
	 String Fid;
	 String name;
	 String Rmessage;
	 String Smessage;
	 String password;
	 void setCredentials(String Fid,String name,String password) {
		 this.Fid=Fid;
		 this.name=name;
		 this.password=password;
	 }
	 void viewCredentials() {
		 System.out.println("ur face book id is "+Fid);
		 System.out.println("ur name in account is "+name);
		 System.out.println("------------");
	 }
	 void changepassword(String currentpassword,String newPassword) {
		 if(currentpassword==password){
		         password=newPassword;}
		         
		   else{
		         System.out.println("enter correct password");
		         
		         }}
	 void sendMessage(chat c1,String message) {
		 c1.Rmessage=message;
		 Smessage=message;
	 }
	 
	 
 }