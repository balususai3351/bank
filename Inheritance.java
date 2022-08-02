
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport1 t=new Transport1("hyd","pnq",4000.0);
		t.getdetails();
		PublicTransport pt=new PublicTransport("vij","hyd",2000,8,5,3);
		pt.getdetails();
		bus b=new bus("mumbai", "pune", 1000, 11, 6, 5, "orange Travels", "sleeper", 4.3f);
		b.getdetails();
		
	}

}

class Transport1{
	String source;
	String destination;
	double price;
	public Transport1(String source, String destination, double price) {
		super();
		this.source = source;
		this.destination = destination;
		this.price = price;
	}
	void getdetails() {
		System.out.println("ur source is "+source);
		System.out.println("ur destination is "+destination);
		System.out.println("ur price is"+price);
	}
	
	
}
 class PublicTransport extends Transport1{
	 int noOfPersons;
	 int noOfAdults;
	 int noOfChildren;
	public PublicTransport(String source, String destination, double price, int noOfPersons, int noOfAdults,
			int noOfChildren) {
		super(source, destination, price);
		this.noOfPersons = noOfPersons;
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
	}
	void getdetails() {
		super.getdetails();
		System.out.println("no of persons u r travelling with "+noOfPersons);
		System.out.println("no of adults u r travelling with "+noOfAdults);
		System.out.println("no of children u r travelling with "+noOfChildren);
		
	}
	 
	
 }
 class bus extends PublicTransport{
	 String busCompany;
	 String type;
	 float rating;
	public bus(String source, String destination, double price, int noOfPersons, int noOfAdults, int noOfChildren,
			String busCompany, String type, float rating) {
		super(source, destination, price, noOfPersons, noOfAdults, noOfChildren);
		this.busCompany = busCompany;
		this.type = type;
		this.rating = rating;
	}
	void getdetails() {
		super.getdetails();
		System.out.println("company of the bus is "+busCompany);
		System.out.println("type of the bus is "+type);
		System.out.println("rating of the bus is "+rating);
		
	}
	 
 }
 