import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		MyFileReader f1=new MyFileReader("C:/Users/MBU13/Documents/mohan.txt");
		f1.readFileData();
		f1.close();

	}

}
 class MyFileReader{
	 FileInputStream fin;
	 
	 MyFileReader(String filepath) throws FileNotFoundException{
		 System.out.println("trying to open the file");
		 fin=new FileInputStream(filepath);
		 System.out.println("file is opened");
	 } 
 void readFileData() throws IOException, InterruptedException {
	 byte b=(byte) fin.read();//integer is converted to byte
	 while(b!=-1) {
		 System.out.print((char)b);
		 b=(byte) fin.read();
		 Thread.sleep(500);
	 }
 }
 void close() throws IOException {
	 fin.close();
 }
 }