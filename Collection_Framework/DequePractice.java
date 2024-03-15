import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Iterator;

public class DequePractice {
    public static void main(String[] args) {
        // Lifo /stack Implementation
        Deque <Integer> dq=new ArrayDeque<>();
        dq.addFirst(0);//Inserts the specified element at the front of the deque.
        dq.offerFirst(1);
        dq.offerFirst(2);//Inserts the specified element at the front of the deque unless it violates the capacity restriction.
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.add(5);//This method is used to insert a specified element into the queue represented by the deque
        dq.addLast(5);//Inserts the specified element at the front of the deque.
        System.out.println("Is 4 is present in deque : "+dq.contains(4));//Returns true if the deque contains the specified element.

        System.out.println(dq);

        dq.pollFirst();//	Retrieves and remove the last element of the deque or may return null if the deque is empty.
        dq.pollFirst();
        dq.pollFirst();
        dq.pollFirst();
        System.out.println(dq);


        List<Integer> listIntegers=new ArrayList<>();
        listIntegers.add(10);
        listIntegers.add(20);
        listIntegers.add(30);
        listIntegers.add(40);
        listIntegers.add(50);

        Deque<Integer> dq2=new ArrayDeque<>(listIntegers);//Adds all the elements in the specified collection at the end of the deque.
        System.out.println(dq2);
        Iterator<Integer> itr=dq2.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
