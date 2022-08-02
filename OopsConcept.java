
public class OopsConcept
{
	public static void main(String[] args) 
	{
		Transport t=new Transport();
		t.travel();
		t.travel(1200.5f);
		t.travel(1500);
		t.travel("orange travels");
		t.travel("krishna-travels", 1500);
		t.travel("hyderabad", "vijayawada");
		t.travel("vijayawada", "pune",10000 );
		
	}

}
class Transport
{
	 void travel() 
	 {
		 System.out.println("i want to travel by any way");
	 }
	 void travel(String busName)
	 {
		 System.out.println("i want to travel by "+busName+" bus");
	 }
	 void travel(int price)
	 {
		 System.out.println("i want to travel in this price limit(int-price) "+price);
	 }
	void travel(float price) 
	{
		System.out.println("i want to travel in this price limit(float-price) "+price);
	}
	void travel(String busName,int price)
	{
		System.out.println("i wnt to travel through"+busName+ " in travel range of "+price);
	}
	void travel(String source, String destination) {
		System.out.println("i want to travel from "+source+" to "+destination);
	}
	void travel(String source,String destination,int price) 
	{
		System.out.println("i want to travel from "+source+" to "+destination+ "in price limit of"+price);
		
	}
	
}