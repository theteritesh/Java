import java.util.*;
public class oddeven{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rem=num%2;
        if(rem==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");   
        }
    }
}