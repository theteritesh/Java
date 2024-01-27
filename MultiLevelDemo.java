public class MultiLevelDemo{
	public static void main(String arg[]){
		programmer prog= new programmer("SIMCA", "12/03/2002", "Narhe", 23, "MCA", 23101, 30000, "JAVA", "backend", 12);
		prog.displayPerson();
		//prog.displayEmployee();
		prog.displayProgrammer(10);
		prog.displayProgrammer("php");

		Employee emp = new programmer();
		emp.display();
	}
} 