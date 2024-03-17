import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetPractice {
    public static void main(String[] args) {
        
        Set<Integer> linkedSet=new LinkedHashSet<>();
        linkedSet.add(1);
        linkedSet.add(2);
        linkedSet.add(3);
        linkedSet.add(4);
        linkedSet.add(5);
        linkedSet.add(6);
        // the insertion order in linked HashSet is mantain
        for (int x: linkedSet)
            System.out.println(x);

        
    }
}
