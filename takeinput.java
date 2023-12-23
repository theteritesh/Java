import java.util.*;
public class takeinput{
    public static void main(String args[]) {
        System.out.println("Enter your first name :");
        Scanner sc = new Scanner(System.in);
        String first,middle,last;
        first=sc.nextLine();
        System.out.println("Enter your middle name :");
        middle=sc.nextLine();
        System.out.println("Enter your last name :");
        last=sc.nextLine();
        System.out.println(first+" "+middle+" "+last);
    }
}