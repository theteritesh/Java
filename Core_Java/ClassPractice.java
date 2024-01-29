import java.util.*;

public class ClassPractice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean a=true;
        Calculator cal=new Calculator();
        int result;
        do{
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulos");
            System.out.println("6.Exit");
            System.out.println("Enter opration = ");
            int opr=sc.nextInt();
            if(opr==6){
                break;
            }
            System.out.println("Enter 1st Value = ");
            int x=sc.nextInt();
            System.out.println("Enter 2nd Value = ");
            int y=sc.nextInt();

        
            switch (opr) {
                case 1:
                    result=cal.add(x,y);
                    System.out.println(x+"+"+y+"="+result);
                    break;
                case 2:
                    result=cal.sub(x,y);
                    System.out.println(x+"-"+y+"="+result);
                    break;
                case 3:
                    result=cal.mul(x,y);
                    System.out.println(x+"*"+y+"="+result);
                    break;
                case 4:
                    result=cal.div(x,y);
                    System.out.println(x+"/"+y+"="+result);
                    break;
                case 5:
                    result=cal.mod(x,y);
                    System.out.println(x+"%"+y+"="+result);
                    break;
                default:
                    System.out.println("Invalid Input...");
                    break;
            }
        }while(a);
    }
}