import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

public class BookAssignment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("objects are creating");
		Book b1=new Book(1,"thomas","relativity",3.4f,23,1543.7f);
		Book b2=new Book(2,"rowling","harry potter",3.0f,2300,20000.7f);
		Book b3=new Book(3,"christopher","inception",1.8f,48,1843.7f);
		Book b4=new Book(4,"jane","creative thoughts",1.25f,230,1345.50f);
		System.out.println("objects are created");
		
		FileOutputStream fout =new FileOutputStream("C:\\Users\\MBU13\\Documents\\mohan3.txt");
		System.out.println("file creation completed now object stream");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		System.out.println("object stream created");
		
		
		HashSet<Book> hs =new HashSet();
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		oos.writeObject(hs);
		
		
		

	}

}
 
	
	
