import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionListPractice {
    public static void main(String[] args) {
        System.out.println("Collection");
        Collection <Integer> nums=new  ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        for(int n:nums){
            System.out.println(n);
        }

        System.out.println("List");

        List <Integer>n=new ArrayList<Integer>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        for (int num:n){
            System.out.println("Index :"+n.indexOf(num)+"-> Value : "+num);
        }
        System.out.println("value of index 2"+n.get(2));
        System.out.println("Index of 5 : "+ n.indexOf(5));
        
    }

    
}