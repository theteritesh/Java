import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Action as per referanc....");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int ref=sc.nextInt();
        System.out.println("Enter the two number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (ref) {
            case 1:
                int sum=a+b;
                System.out.println("Addition of "+a+"and"+b+"is"+sum);
                break;
                case 2:
                int sub=a-b;
                System.out.println("Subtraction of "+a+"and"+b+"is"+sub);
                break;
                case 3:
                int mul=a*b;
                System.out.println("Multiplication of "+a+"and"+b+"is"+mul);
                break;
                case 4:
                int div=a/b;
                System.out.println("Division of "+a+"and"+b+"is"+div);
                break;
        
            default:
            System.out.println("Invalid Input");
                break;
        }
    }
}