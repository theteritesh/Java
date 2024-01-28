import java.util.*;

public class SwitchStatement{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Day = ");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Thuesday");
                break;
            case 4:
                System.out.println("Wendday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalide Input");


        }
    }
}