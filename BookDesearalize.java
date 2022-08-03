import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

public class BookDesearalize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
       FileInputStream fis=new FileInputStream("C:\\Users\\MBU13\\Documents\\mohan3.txt");
       ObjectInputStream ois= new ObjectInputStream(fis);
        HashSet<Book> hs=(HashSet<Book>)ois.readObject();
        for( Book b: hs) {
        	System.out.println(b);
        }
       
	}

}
