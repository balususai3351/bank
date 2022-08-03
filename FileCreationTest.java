import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("creating the new file");
		FileOutputStream fout =new FileOutputStream("C:/Users/MBU13/Documents/mohan2.txt");
		System.out.println("file created........");
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 
		 
		 byte ba[]=str.getBytes();
		 System.out.println("converted string into byte array");
		 fout.write(ba);
		 System.out.println("byte array is written into the file");
		 fout.close();
		 System.out.println("file is succesfully closed");

	}

	
		
	}


