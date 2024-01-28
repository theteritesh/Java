public class TypeCasting{
    public static void main (String args[]){
        byte b=127;
        int a=b;
        System.out.println(a);

        int a1=126;
        byte b1=(byte)a1;
        System.out.println(b1);

        int a2=257;
        byte b2=(byte)a2;
        System.out.println(b2);

        float f=5.6f;
        int a3=(int)f;
        System.out.println(a3);

        byte num1=10;
        byte num2=30;
        int result=num1*num2;
        System.out.println(result);

    }
}