public class Person{
	String name, dob, address;
 	int age;
	Person(String name, String dob, String address, int age){
		this.name=name;
		this.dob=dob;
		this.address=address;
 		this.age=age;
	}
	Person(){}
	public void displayPerson(){
		System.out.println("name="+name);
		System.out.println("dob="+dob);
		System.out.println("Address="+address);
		System.out.println("Age="+age);	
	}
}
