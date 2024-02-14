import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class CollectionSetPractice {
    public static void main(String[] args) {
        System.out.println("Hash SET");
        Set <Integer> num = new HashSet<Integer>();
        num.add(1);
        num.add(3);
        num.add(2);
        num.add(9);

        for (int n:num){
            System.out.println(n);
        }
        System.out.println("TREE SET");
        Set <Integer> num1 = new TreeSet<Integer>();
        num1.add(1);
        num1.add(3);
        num1.add(2);
        num1.add(9);

        for (int n:num1){
            System.out.println(n);
        }
        System.out.println("Iterable");
        Collection <Integer> num2 = new TreeSet<Integer>();
        num2.add(1);
        num2.add(3);
        num2.add(2);
        num2.add(9);

        Iterator <Integer> values=num2.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }
        
    }
}
