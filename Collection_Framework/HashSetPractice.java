import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class StudentMarks implements Comparable<StudentMarks>{
    private int math;
    private int physics;
    public int getMath() {
        return math;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + math;
        result = prime * result + physics;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentMarks other = (StudentMarks) obj;
        if (math != other.math)
            return false;
        if (physics != other.physics)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Math=" + math + ", Physics=" + physics;
    }
    public int getPhysics() {
        return physics;
    }
    public StudentMarks(int math, int physics) {
        this.math = math;
        this.physics = physics;
    }
    @Override
    public int compareTo(StudentMarks o) {
        System.out.println("Comparable compareTo()");
        return o.math-this.math;
    }
}

public class HashSetPractice {
    public static void main(String[] args) {
        Set<Integer> setIntegers=new HashSet<>();
        setIntegers.add(2);
        setIntegers.add(3);
        setIntegers.add(6);
        setIntegers.add(2);
        setIntegers.add(5);
        // System.out.println(setIntegers);

        Set <Integer> setIntegers2=new HashSet<>();
        setIntegers2.add(6);
        setIntegers2.add(9);
        setIntegers2.add(2);
        setIntegers2.add(10);

        // System.out.println(setIntegers2.contains(2));
        // System.out.println(setIntegers2.contains(15));



        // System.out.println("Integer Set 1: "+setIntegers);
        // System.out.println("Integer Set 2: "+setIntegers2);

        // System.out.println("Intersection Of sets :");
        // setIntegers.retainAll(setIntegers2);
        // System.out.println("Integer Set 1: "+setIntegers);

        // System.out.println("Differene Of sets :");
        // setIntegers.removeAll(setIntegers2);
        // System.out.println("Integer Set 1: "+setIntegers);

        // System.out.println("Union Of sets :"); 
        // setIntegers.addAll(setIntegers2);
        // System.out.println("Integer Set 1: "+setIntegers);



        List <String> listStrings=new ArrayList<>();
        listStrings.add("Ritesh");
        listStrings.add("Ganesh");
        listStrings.add("Mahesh");
        listStrings.add("Ritesh");

        // Set<String> setStrings=new HashSet<>(listStrings);
        // System.out.println(setStrings);

        List<StudentMarks> lStudentMarks=new ArrayList<>();
        lStudentMarks.add(new StudentMarks(70,40));
        lStudentMarks.add(new StudentMarks(100,20));
        lStudentMarks.add(new StudentMarks(10,50));
        lStudentMarks.add(new StudentMarks(40,100));
        lStudentMarks.add(new StudentMarks(80,30));
        Set<StudentMarks> StudentMarksSet=new HashSet<>(lStudentMarks);

        for(StudentMarks sm:StudentMarksSet)
            System.out.println(sm);

        System.out.println(StudentMarksSet.contains(new StudentMarks(100,20)));
    }
}
