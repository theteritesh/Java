import java.util.*;
public class greter{
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a==b){
            System.out.print("a equls to b");  
        } 
        else if(a>b){
            System.out.print("a is greater");
        }
        else{
            System.out.print("a is smaller");
        }
    }
}