import java.util.*;
public class sum_of_n{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=i+sum;
        }
        System.out.println(sum);
    }
}