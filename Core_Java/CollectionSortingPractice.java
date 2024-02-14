import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
class Students //implements Comparable<Students>
{
    int age;
    String name;
    
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

    // public int compareTo(Students that) {
    //     if(this.age>that.age){
    //         return 1;                    
    //     }else{
    //         return -1;
    //     }
    // }
}
public class CollectionSortingPractice {
    public static void main(String[] args){
        Comparator<Students> com=(i,j)->i.age>j.age?1:-1;
                
        List<Students> stud=new ArrayList<>();
        stud.add(new Students(26,"ganesh"));
        stud.add(new Students(22,"Mahesh"));
        stud.add(new Students(25,"Lokesh"));

        Collections.sort(stud,com);

        for(Students s:stud){
            System.out.println(s);
        }
    }
}
 