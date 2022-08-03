
public class Demo1 {

	public static void main(String[] args) throws IncompleteException {
		// TODO Auto-generated method stub
		System.out.println("creating first object");
        Department d=new Department();
        System.out.println("object is created");
        d.setId(10);
        System.out.println("id of first department is "+d.getId());
        d.setName("finance");
        System.out.println("name of the first department is "+d.getName());
        d.setLocation("hinjewadi-pune");
        System.out.println("location of the first department is "+d.getLocation());
        d.setNoOfEmp(5);
        System.out.println("no of employees in first department is "+d.noOfEmp);
        System.out.println("---------------------------------------------------------");
        
        /*System.out.println("creating second object");
         Department d2=new Department();
         System.out.println("object is created");
         d2.setId(20);
         System.out.println("id of second department is "+d2.getId());
         d2.setName("HR");
         System.out.println("name of the second department is "+d2.getName());
         d2.setLocation("hinjewadi-pune-phase2");
         System.out.println("location of the second department is "+d2.getLocation());
         d2.setNoOfEmp(10);
         System.out.println("no of employees in second department is "+d2.noOfEmp);*/
        Department d2=CreateDepartment.createDept("HR", "HINJEWADI-PHASE2");
        System.out.println("id of second department is "+d2.getId());
        System.out.println("name of the second department is "+d2.getName());
        System.out.println("location of the second department is "+d2.getLocation());
        System.out.println("no of employees in second department is "+d2.noOfEmp);
        
        System.out.println("-------------------------------\n");
        
        Department d3=CreateDepartment.createDept("SALES", "HINJEWADI-PHASE3");
        System.out.println("id of second department is "+d3.getId());
        System.out.println("name of the second department is "+d3.getName());
        System.out.println("location of the second department is "+d3.getLocation());
        System.out.println("no of employees in second department is "+d3.noOfEmp);
       
System.out.println("-------------------------------\n");
        
        Department d4=CreateDepartment.createDept(null, "HINJEWADI-PHASE3");
        System.out.println("id of second department is "+d4.getId());
        System.out.println("name of the second department is "+d4.getName());
        System.out.println("location of the second department is "+d4.getLocation());
        System.out.println("no of employees in second department is "+d4.noOfEmp);
        
         
         
         
	}

}
class IncompleteException extends Exception{
	IncompleteException(String msg){
		 super(msg);
	}
	
}
class Department{
	static int l=10;
	int id=10;
	String name;
	String location;
	int noOfEmp;
	
	
	
	public Department() {
		super();
	}
	public Department( String name, String location) {
		super();
		this.name = name;
		this.location = location;
		this.noOfEmp = 0;
		l=l+10;
		this.id=l;
		if(name==null) {
			System.out.println("please enter the name of Department that you want to create");
			
		}
		if(location==null) {
			System.out.println("please enter location ");
			
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	
	
}
class CreateDepartment{
	 static Department createDept(String name ,String location) throws IncompleteException {
		 if(name!=null && location!=null) {
			 return new Department(name,location);
		 }
		 else {
			 IncompleteException e =new IncompleteException("please enter the both name and location");
			 throw e;
			 
		 }
	 }
}
