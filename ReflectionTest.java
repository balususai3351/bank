import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight f1=new Flight(111);
		Class theclass =f1.getClass();
		System.out.println(theclass.getName());
		Method methods[]=theclass.getMethods();
		int i=0;
		for (Method method : methods) {
			i++;
			System.out.println("method"+i+":"+method.getName());
			
		}
		Constructor cr[]=theclass.getConstructors();
		for (Constructor constructor : cr) {
			System.out.println(constructor.getParameterCount());
		Parameter prms[]=constructor.getParameters();
		for(Parameter p : prms) {
			System.out.println(p);
			
		}
			
		}
		
		

	}

}
class Flight{
	int flightNo;
	String flightName;
	String source;
	String destination;
	int capacity;
	public Flight(int flightNo, String flightName, String source, String destination, int capacity) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.capacity = capacity;
	}
	public Flight(int flightNo, String flightName, String source, String destination) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
	}
	public Flight(int flightNo) {
		super();
		this.flightNo = flightNo;
	}
	public Flight(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}
	public Flight(String source, String destination, int capacity) {
		super();
		this.source = source;
		this.destination = destination;
		this.capacity = capacity;
	}
	public Flight(int flightNo, String flightName) {
		super();
		this.flightNo = flightNo;
		this.flightName = flightName;
	}
	public Flight(int flightNo, String source, String destination, int capacity) {
		super();
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
		this.capacity = capacity;
	}
	void fly() {
		System.out.println("hey flight is flying...............");
	}
	void land() {
		System.out.println("hey flight is landing.......");
	}
	
	void takeOver() {
		System.out.println("hey flight is about to take over...");
	}
	
	
	
}
