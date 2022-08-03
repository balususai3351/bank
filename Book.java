import java.io.Serializable;
import java.util.TreeMap;

class Book implements Serializable{
	int bookNo;
	String bookAuther;
	String bookTitle;
	float edition;
	int noOfPages;
	Float bookPrice;
	public Book(int bookNo, String bookAuther, String bookTitle, float edition, int noOfPages, Float bookPrice) {
		super();
		this.bookNo = bookNo;
		this.bookAuther = bookAuther;
		this.bookTitle = bookTitle;
		this.edition = edition;
		this.noOfPages = noOfPages;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookAuther=" + bookAuther + ", bookTitle=" + bookTitle + ", edition="
				+ edition + ", noOfPages=" + noOfPages + ", bookPrice=" + bookPrice + "]";
	}
	
	
}
interface foot{
	double  area=0;
	default void go() {
		
	}
	
}
class myfoot implements foot{

}
	

	