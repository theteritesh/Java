public class Student{
    int rollNo=100;
    String name="Ritesh";
    String course="Mca";
    public void display(){
        System.out.println("Roll no. :- "+rollNo);
        System.out.println("Name :- "+name);
        System.out.println("Course :- "+course);
    }
    public static void main(String[] args) {
        Student stud =new Student();
        stud.display();
    }
}