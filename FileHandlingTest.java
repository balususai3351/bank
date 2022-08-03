import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest {

	public static void main(String[] args) throws  InterruptedException, IOException {
		
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("C:/Users/MBU13/Documents/mohan.txt");
			System.out.println("file is opening");
			byte b=(byte) fin.read();
			while(b!=-1) {
				System.out.print((char)b);
				b=(byte)fin.read();
				Thread.sleep(500);
				fin.close();
				System.out.println("file is closed");
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("problem1 is:  "+e);
			
			
		}
		
		

	}

}

