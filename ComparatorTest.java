import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Student {
    String name;
    int rollno;
    int marks;
    
  
	public Student(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}
	
}

class CompareTest implements Comparator<Student>{
	
	@Override
	public int compare(Student s1,Student s2) {
		// TODO Auto-generated method stub
		return s1.rollno-s2.rollno;
	}
	

	}
class Sortbyname implements Comparator<Student> {
	 
    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b)
    {
 
        return a.name.compareTo(b.name);
	
    }
}

