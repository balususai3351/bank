import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Printstream {


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fout;
		fout=new FileOutputStream("C:/Users/MBU13/Documents/mohan3.txt");
		System.out.println("File is ready");
		PrintStream ps=new  PrintStream(fout);
		ps.println("Hello file1");
		

	}

}

