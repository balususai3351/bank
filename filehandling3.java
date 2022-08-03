import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filehandling3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("trying to open the file");
		FileReader fin =new FileReader("C:/Users/MBU13/Documents/mohan.txt");
		char i=(char)fin.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=(char)fin.read();
			
		}

	}

}
