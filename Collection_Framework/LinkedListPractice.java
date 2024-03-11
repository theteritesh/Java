import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList <Integer> aLinkedList=new LinkedList<>();
        aLinkedList.add(1);//It is used to append the specified element to the end of a list.
        aLinkedList.add(2);
        aLinkedList.add(3);
        aLinkedList.add(4);
    
        aLinkedList.add(4,5);//It is used to insert the specified element at the specified position index in a list.
        System.out.println("LinkedList : "+aLinkedList);

        List<Integer> arrList=new ArrayList<>();
        arrList.add(9);
        arrList.add(10);

        aLinkedList.addAll(arrList);//It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
        System.out.println("LinkedList After Using addAll : "+aLinkedList);

        List<Integer> arrList2=new ArrayList<>();
        arrList2.add(6);
        arrList2.add(7);
        arrList2.add(8);

        aLinkedList.addAll(5, arrList2);//It is used to append all the elements in the specified collection, starting at the specified position of the list.
        System.out.println("LinkedList After Using addAll for specific index: "+aLinkedList);

        aLinkedList.addFirst(0);//It is used to insert the given element at the beginning of a list.
        aLinkedList.addLast(11);//It is used to append the given element to the end of a list.

        System.out.println("LinkedList After Using addFirst And addLast : "+aLinkedList);

        System.out.println(aLinkedList.contains(12)); //It is used to return true if a list contains a specified element.
        
        System.out.println("First Element : "+aLinkedList.element());//It is used to retrieve the first element of a list.
        System.out.println("Index 5  Element : "+aLinkedList.get(5));//It is used to return the element at the specified position in a list.
        System.out.println("Get First  Element : "+aLinkedList.getFirst());//It is used to return the first element in a list.
        System.out.println("Get Last  Element : "+aLinkedList.getLast());//It is used to return the last element in a list.
        
        System.out.println("Index of 6 : "+aLinkedList.indexOf(6));//It is used to return the index in a list of the first occurrence of the specified element, or -1 if the list does not contain any element.
        System.out.println("Index of 10 : "+aLinkedList.lastIndexOf(10));//It is used to return the index in a list of the last occurrence of the specified element, or -1 if the list does not contain any element.
        
        int apeek=aLinkedList.peek();//It retrieves the first element of a list
        System.out.println("A peeked Elemenet: "+apeek);

        int apeeklast=aLinkedList.peekLast();//	It retrieves the last element of a list or returns null if a list is empty.
        System.out.println("A peeked Last Elemenet: "+apeeklast);

        aLinkedList.poll();//It retrieves and removes the first element of a list.
        aLinkedList.pollFirst();//	It retrieves and removes the first element of a list, or returns null if a list is empty.
        aLinkedList.pollLast();//	It retrieves and removes the last element of a list, or returns null if a list is empty.

        aLinkedList.pop();//It pops an element from the stack represented by a list.
        System.out.println("LinkedList : "+aLinkedList);

        aLinkedList.push(1);//It pushes an element onto the stack represented by a list.
        System.out.println("LinkedList : "+aLinkedList);

        aLinkedList.remove();//It is used to retrieve and removes the first element of a list.
        System.out.println("LinkedList : "+aLinkedList);
        
        aLinkedList.remove(3);//It is used to remove the element at the specified position in a list.
        System.out.println("LinkedList : "+aLinkedList);

        aLinkedList.set(1, 10);//	It replaces the element at the specified position in a list with the specified element.
        System.out.println("LinkedList : "+aLinkedList);

        System.out.println("Linnked List Size : "+aLinkedList.size());//It is used to return the number of elements in a list.

        ListIterator<Integer> iterator=aLinkedList.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        
        // next = return items[index ++]
        // prev = return items[--index]

        for(int x:aLinkedList){
            System.out.print(x+" <--> ");
        }
        System.out.println();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" <--> ");
        }
        System.out.println();

        Iterator<Integer> i=aLinkedList.descendingIterator();
        while (i.hasNext()) 
            System.out.print(i.next()+" - ");

        
        System.out.println();

        
        aLinkedList.clear();
        System.out.println("LinkedList After Using clear : "+aLinkedList);
        
    }
}
