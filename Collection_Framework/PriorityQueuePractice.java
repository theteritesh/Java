import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StudentMarks implements Comparable<StudentMarks>{
    private int math;
    private int physics;
    public int getMath() {
        return math;
    }
    @Override
    public String toString() {
        return "Math=" + math + ", Ptrhysics=" + physics;
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
        // currenObjet<anotherObjet
        //     return -1(Negative)
        // currentObject>anotherObject
        //     return 1(positive)
        // currentObject=anotherObject
        //     return 0

        // if(this.math<o.math){
        //     return -1;
        // }
        // if(this.math>o.math){
        //     return 1;
        // }
        // if (this.math==o.math) {
        //     return 0;
        // }
        System.out.println("Comparable compareTo()");
        return o.math-this.math;
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
       return o2-o1;
    }

}
// class MyComparatorForStudent implements Comparator<StudentMarks>{

//     @Override
//     public int compare(StudentMarks o1, StudentMarks o2) {
//        return o1.math-o2;
//     }

// }
public class PriorityQueuePractice {
    public static void main(String[] args) {
        // PriorityQueue <String> pqStrings=new PriorityQueue<>();
        // pqStrings.offer("lmn");
        // pqStrings.offer("efg");
        // pqStrings.offer("xyz");
        // pqStrings.offer("Abc");

        // System.out.println(pqStrings);

        PriorityQueue <Integer> pqIntegers=new PriorityQueue<>(new MyComparator());
        pqIntegers.offer(1);
        pqIntegers.offer(2);
        pqIntegers.offer(0);
        pqIntegers.offer(100);
        System.out.println(pqIntegers);

        // top two element

        // List<Integer> top2= new ArrayList<>();
        // int index=0;

        // while (!pqIntegers.isEmpty()) {

        //     if(index==2){
        //         break;
        //     }
        //     top2.add(pqIntegers.poll());
        //     index++;
        // }
        // System.out.println(top2);
        // System.out.println(pqIntegers);

        // List<Integer> bottom2= new ArrayList<>();
        // int index=0;

        // while (!pqIntegers.isEmpty()) {

        //     if(index==2){
        //         break;
        //     }
        //     bottom2.add(pqIntegers.poll());
        //     index++;
        // }
        // System.out.println(bottom2);



        // Top3 Student according There math marks
        List<StudentMarks> lStudentMarks=new ArrayList<>();
        lStudentMarks.add(new StudentMarks(70,40));
        lStudentMarks.add(new StudentMarks(100,20));
        lStudentMarks.add(new StudentMarks(10,50));
        lStudentMarks.add(new StudentMarks(40,100));
        lStudentMarks.add(new StudentMarks(80,30));
        // System.out.println(lStudentMarks);

        PriorityQueue <StudentMarks> pqsStudentMarks=new PriorityQueue<>((a,b)->{
            System.out.println("Comparator compair ()");
            return b.getPhysics()-a.getPhysics();
        });
        List<StudentMarks> top3= new ArrayList<>();
        for(StudentMarks sm:lStudentMarks){
            pqsStudentMarks.add(sm);
        }
        int index=0;

        while (!pqsStudentMarks.isEmpty()) {

            if(index==3){
                break;
            }
            top3.add(pqsStudentMarks.poll());
            index++;
        }
        System.out.println(top3);
        System.out.println(pqsStudentMarks);


    }
}
