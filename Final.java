
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Abc a=new Abc();
		 a.thanos();
		 a.tony();
	}

}

class Abc
{
	String  x="i am inevitable";
	static String s="i am iron man";
	void thanos() {
		System.out.println("thanos says: "+x);
	}
	static void tony() {
		System.out.println("tony says: "+s);
	}	
}

 
abstract class telephone {
	abstract void battery();
}
	
abstract class mobile extends telephone{
	void battery(){
		System.out.println("i m battery");
	}
	abstract void storage();
}
class smart extends mobile{
	void storage() {
		System.out.println(" ii m storage");
	}
}
