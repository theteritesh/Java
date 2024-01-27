public class programmer extends Employee{
	String langName, type;
 	int exp;
	programmer(String name, String dob, String address, int age, String dept, int id, int sal, String langName, String type, int exp){
		super(name, dob, address, age, dept, id, sal);
		this.langName=langName;
		this.type=type;
		this.exp=exp;
		super.sal=100000;
 	}
	programmer(){
		super();
	}
	public void displayProgrammer(int exp){
		System.out.println("Language Name="+langName);
		System.out.println("Programmer Type="+type);
		System.out.println("Experience="+exp);
		super.displayEmployee();
	}
	public void displayProgrammer(String langName){
		System.out.println("Language Name="+langName);
		System.out.println("Programmer Type="+type);
		System.out.println("Experience="+exp);
		super.displayEmployee();
	}
	public void display(){
		System.out.println("Language Name="+langName);	
	}
}