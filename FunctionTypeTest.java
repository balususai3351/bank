
public class FunctionTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalci;
		myCalci =new Calculator();
		myCalci.fun1();
		myCalci.fun2(2,1.2f,23.4);
		int l=myCalci.fun3(2,1.2f,23.4);
        System.out.println(l);
        
        System.out.println(myCalci.fun4());
	}
	

}
 class Calculator
 { 
	 void fun1()
	 {
		 System.out.println("fun is doining its activity");
		 System.out.println("-----------------");
	 }
	 void fun2(int x,float y,double z)
	 {
		 System.out.println("fun2 is doining its activity");
		 System.out.println("x is"+x);
		 System.out.println("y is"+y);
		 System.out.println("z is"+z);
		 System.out.println("-----------");
	 }
	 int fun3(int x,float y,double z)
	 {
		 System.out.println("fun3 is doining its activity");
		 System.out.println("x is"+x);
		 System.out.println("y is"+y);
		 System.out.println("z is"+z);
		 System.out.println("-----------");
		 return 4;
	 }
	 int fun4()
	 {
		 System.out.println("fun4 is doining its activity");
		 System.out.println("-----------------");
		 return 143;
	 }
 }
 
 /*
 four types of function
 1.fun without arguments and without return value
 2.fun with arguments without return type
 3.fun with arguments and return value
 4.function without arguments and return value
 */