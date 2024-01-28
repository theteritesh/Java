public class AssignmentOperator{
    public static void main(String args[]){
        int num1= 30;
        int num2=10;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);

        num1=num1+2;
        System.out.println(num1);
        num1 +=2;
        System.out.println(num1);

        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);
        
        int num=10;
        int result=num++;   //post increment
        System.out.println(result);
        int result2=++num;  //pre increament
        System.out.println(result2);


        
    }
}