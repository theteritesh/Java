import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> aList=new ArrayList<>();
        aList.add(1);//It is used to append the specified element at the end of a list.
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);
        aList.add(5,6);//It is used to insert the specified element at the specified position in a list.


        System.out.println("The element that got replaced : "+aList.set(3, 10));
        
        int element=aList.get(3);//It is used to fetch the element from the particular position of the list.
        System.out.println("get a element using get method : "+element);
        
        aList.remove(1);//It is used to remove the element present at the specified position in the list.
        aList.remove(4);//It is used to remove the first occurrence of the specified element.


        System.out.println("ArrayList 1 : "+ aList);
        


        List <Integer> aList2=new ArrayList<>(aList);
        System.out.println("ArrayList 2 : "+aList2);
        aList2.add(6);
        aList2.add(7);
        System.out.println("ArrayList 2 : " +aList2);
        

        List<Integer> aList3=new ArrayList<>();
        aList3.add(10);
        aList3.add(20);
        aList3.add(30);
        aList3.add(40);
        aList3.add(10);
        aList3.addAll(aList);//It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
        aList3.addAll(1,aList2);//It is used to append all the elements in the specified collection, starting at the specified position of the list.
        System.out.println("ArrayList 3 : " +aList3);
        System.out.println("ArrayList 3 Index Of Element(30): " +aList3.indexOf(30));
        System.out.println("ArrayList 3 Last Index Of 10 Element: " +aList3.lastIndexOf(10));//It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.

        
        List <Integer> subList=aList3.subList(0, 4); //4 is excluded Only get element to -1 index
        subList.set(0, 100);
        System.out.println("SubList : "+  subList);
        System.out.println("ArrayList 3 : " +aList3);//sublist make changes to parent list

        aList.clear();
        System.out.println("removed all elements from ArrayList (aList) Using Clear -> "+ aList);//It is used to remove all of the elements from this list.

        System.out.println("It returns true if the list is empty :"+aList.isEmpty());
        System.out.println("It returns true if the list is empty , otherwise false :"+aList2.isEmpty());

        List<Integer> aList5=new ArrayList<>();
        aList5.add(4);
        aList5.add(2);
        aList5.add(5);
        aList5.add(3);
        aList5.add(1);

        System.out.println("ArrayList 5 : "+aList5);

        aList5.sort(null);
        System.out.println("ArrayList 5 Sorted: "+aList5);

        System.out.println("Size of aList5 : "+aList5.size());


    }
}
