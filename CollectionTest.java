
public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericTest<Integer> g1=new genericTest<Integer>(8,5);
		g1.printDetails();
		System.out.println(g1.toString());
		g1.swap();
		g1.printDetails();
		System.out.println("-----------------------------------");
		
		genericTest<Float> g2=new genericTest<Float>(8.3f,5.45f);
		g2.printDetails();
		System.out.println(g2.toString());
		g2.swap();
		g2.printDetails();
		System.out.println("-----------------------------------");
		
		genericTest<String> g3=new genericTest<String>("hello","hi");
		g3.printDetails();
		System.out.println(g3.toString());
		g3.swap();
		g3.printDetails();
		System.out.println("-----------------------------------");
		
		genericTest<Character> g4=new genericTest<Character>('a','b');
		g4.printDetails();
		System.out.println(g4.toString());
		g4.swap();
		g4.printDetails();
		System.out.println("-----------------------------------");
		
		song s1=new song("dust till down","zya-sia","zyan malik");
		song s2 =new song("rolex","vikram","anirudh");
		
		genericTest<song> g5=new genericTest<song>(s1,s2);
		g5.printDetails();
		System.out.println(g5.toString());
		g5.swap();
		g5.printDetails();
		System.out.println("-----------------------------------");
		
		
	
	}

}
class genericTest<T> {
	T a;
	T b;
	
	public genericTest(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}
	void printDetails() {
		System.out.println(a);
		System.out.println(b);
		
	}
	@Override
	public String toString() {
		return "genericTest [a=" + a.toString() + ", b=" + b.toString() + "]";
	}
	void swap() {
		T temp=a;
		a=b;
		b=temp;
	}
	
	
}
class song{
	String name;
	String Album;
	String composer;
	public song(String name, String album, String composer) {
		super();
		this.name = name;
		Album = album;
		this.composer = composer;
	}
	@Override
	public String toString() {
		return "song [name=" + name + ", Album=" + Album + ", composer=" + composer + "]";
	}
	
	
	
	
}
