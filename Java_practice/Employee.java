public class Employee extends Person{
	String dept;
 	int id, sal;
	Employee(String name, String dob, String address, int age, String dept, int id, int sal){
		super(name, dob, address, age);
		this.dept=dept;
		this.id=id;
		this.sal=sal;
 	}
	Employee(){
		super();
	}
	public void displayEmployee(){
		System.out.println("Department="+dept);
		System.out.println("ID="+id);
		System.out.println("Salary="+sal);
		
	}
	public void display(){
		System.out.println("Department="+dept);	
	}
}