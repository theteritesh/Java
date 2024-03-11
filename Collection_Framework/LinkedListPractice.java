import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {
    public static void main(String[] args) {
        List <Integer> aLinkedList=new LinkedList<>();
        aLinkedList.add(1);
        aLinkedList.add(2);
        aLinkedList.add(3);
        aLinkedList.add(4);

        ListIterator<Integer> iterator=aLinkedList.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        // next = return items[index ++]
        // prev = return items[--index]

        
    }
}
