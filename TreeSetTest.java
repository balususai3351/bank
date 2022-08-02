import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSetTest {
	public static void main(String[] args) {
		element e1=new element(1,"hydrogen","H",2);
		element e2=new element(2,"helium","He",4);
		element e3=new element(3,"litium","Li",6);
		element e4=new element(7,"nitrogen","N",14);
		element e5=new element(8,"oxygen","0",16);
		
	
	TreeSet<element> ts=new TreeSet();
	System.out.println("adding first element................");
	ts.add(e1);
	System.out.println("adding second element................");
	ts.add(e2);
	System.out.println("adding third element................");
	ts.add(e3);
	System.out.println("adding fourth element................");
	ts.add(e4);
	System.out.println("adding fifth element................");
	ts.add(e5);
	
	java.util.Iterator<element> it=ts.iterator();
	
	while(it.hasNext()) {
		element e=it.next();
		System.out.println(it);
	}
	
	
	
	}
}
class element implements Comparable<element>{
	int periodicNumber;
	String name;
	String atomicSymbol;
	int atomicWeight;
	
	public element(int periodicNumber, String name, String atomicSymbol, int atomicWeight) {
		super();
		this.periodicNumber = periodicNumber;
		this.name = name;
		this.atomicSymbol = atomicSymbol;
		this.atomicWeight = atomicWeight;
	}

	@Override
	public String toString() {
		return "element [periodicNumber=" + periodicNumber + ", name=" + name + ", atomicSymbol=" + atomicSymbol
				+ ", atomicWeight=" + atomicWeight + "]";
	}

	@Override
	public int compareTo(element o) {
		// TODO Auto-generated m
		
		return 0;
	}

	
	
	
	
	
}
