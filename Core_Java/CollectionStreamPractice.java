import java.util.Arrays;
import java.util.List;
// import java.util.function.Function;
// import java.util.function.Predicate;
// import java.util.stream.Stream;

public class CollectionStreamPractice {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,2,5,3,6);
        // System.out.println(nums);

        // Stream <Integer> s1 =nums.stream();
        // // s1.forEach(n->System.out.println(n));

        // Stream <Integer> s2=s1.filter(n->n%2==0);

        // Stream <Integer> s3=s2.map(n->n*2);
        // int result=s3.reduce(0,(c,e)->c+e);
        // System.out.println(result);

        // s3.forEach(n->System.out.println(n));

        // Predicate <Integer>p=new Predicate<Integer>(){
        //     public boolean test(Integer n){
        //         return n%2==0;
        //     }

        // };

        // Predicate <Integer> p = n -> n%2==0;

        // Function <Integer,Integer> fun=new Function<Integer,Integer>(){
        //     public Integer apply(Integer n){
        //         return n*2;
        //     }
        // };
        // Function <Integer,Integer> fun= n-> n*2;

        int result= nums.stream()
                        .filter(n->n%2==0)
                        .map(n->n*2)
                        .reduce(0,(c,e)->c+e);
        System.out.println(result);
    }
}
