import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book();
		Book book2=new Book();
		Book book3=book1;
       HashSet<Book> bookshelf =new HashSet();
       bookshelf.add(book1);


	}

}
class Book{
	
}