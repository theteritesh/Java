import java.util.*;
public class ConditionalStatement{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Age = ");
        int n=sc.nextInt();
        if(n>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Childe");
        }
        sc.close();
    }
}
