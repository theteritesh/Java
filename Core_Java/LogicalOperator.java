public class LogicalOperator{
    public static void main(String args[]){
        int x=7;
        int y=5;
        int a=5;
        int b=9;

        boolean result=x>y && b>a;
        System.out.println(result);

        result=x<y && b>a;
        System.out.println(result);
        result=x>y && b<a;
        System.out.println(result);
        result=!result;
        System.out.println(result);

        System.out.println();

        result=x>y || b>a;
        System.out.println(result);
        result=x<y || b>a;
        System.out.println(result);
        result=x>y || b<a;
        System.out.println(result);
        result=!result;
        System.out.println(result);

        System.out.println();

        result=x>y || b>a || b>x;
        System.out.println(result);

        System.out.println();
        result=x>y && b>a && b>x;
        System.out.println(result);
    }
}