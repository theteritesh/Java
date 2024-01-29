public class ArrayPractice{
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        num[1]=8;
        System.out.println(num[1]);

        int num2[]=new int[3];
        num2[0]=10;
        num2[1]=20;
        num2[2]=30;
        System.out.println(num2[0]);
        System.out.println(num2[1]);
        System.out.println(num2[2]);

        System.out.println();

        for (int i=0;i<=2;i++){
            System.out.println(num2[i]);
        }
    }
}