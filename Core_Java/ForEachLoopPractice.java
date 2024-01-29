class Student{
    int rollno;
    String name;
}

public class ForEachLoopPractice{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ganesh";
        s1.rollno=88;

        Student s2=new Student();
        s2.name="Mahesh";
        s2.rollno=48;

        Student s3=new Student();
        s3.name="Rahul";
        s3.rollno=80;

        Student stud[]=new Student[3];
        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;

        for (Student s:stud){
            System.out.println(s.name+" : "+s.rollno);
        }
        
    }
}