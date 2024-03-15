import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        //Fifo Queue
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);//It is used to insert the specified element into this queue.
        q.offer(2);
        System.out.println("Element Added : "+q.add(3));//It is used to insert the specified element into this queue and return true upon success.

        System.out.println("First Element using element Method : "+q.element());//It is used to retrieves, but does not remove, the head of this queue.

        System.out.println("First Element using peek Method : "+q.peek());//It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

        System.out.println("First Element removed using remove Method : "+q.remove());//It is used to retrieves and removes the head of this queue.

        System.out.println("First Element removed using poll Method : "+q.poll());//	It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
        q.clear();
        System.out.println(q.poll());
        System.out.println(q.peek());
        // System.out.println(q.remove());
        // System.out.println(q.element());
        

    }
}
