import java.time.LocalDate;

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Person{
	String name;
	char gender;
	int age;
	public Person(String name, char gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
}
class Student extends Person{
	String college;
	String qualification;
	char grade;
	public Student(String name, char gender, int age, String college, String qualification, char grade) {
		super(name, gender, age);
		this.college = college;
		this.qualification = qualification;
		this.grade = grade;
	}
	
}
class Employee extends Student{
	String company;
	String job;
	float salary;
	public Employee(String name, char gender, int age, String college, String qualification, char grade, String company,
			String job, float salary) {
		super(name, gender, age, college, qualification, grade);
		this.company = company;
		this.job = job;
		this.salary = salary;
	}
	
}
class AadharCard{
	long aadharNumber;
	String nameInAadhaar;
	String IssuedBy;
	String adhress;
	LocalDate dateOfBirth;
	long phoneno;
	public AadharCard(long aadharNumber, String nameInAadhaar, String issuedBy, String adhress, LocalDate dateOfBirth,
			long phoneno) {
		super();
		this.aadharNumber = aadharNumber;
		this.nameInAadhaar = nameInAadhaar;
		IssuedBy = issuedBy;
		this.adhress = adhress;
		this.dateOfBirth = dateOfBirth;
		this.phoneno = phoneno;
	}
	
}