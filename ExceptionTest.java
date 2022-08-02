import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try{// TODO Auto-generated method stub
		System.out.println("enter the numerator:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		System.out.println("enter the denominator:");
		Scanner sc2=new Scanner(System.in);
		int j=sc2.nextInt();
		int k=i/j;
		
		String s3="";
		System.out.println(s3.toUpperCase());
		
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
