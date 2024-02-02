final class A{
    public void show(){
        System.out.println("in A");
    }
}

// class B extends A{
//     public void show(){
//         System.out.println("in B");
//     }
// }

public class FinalKeywordPractice {
    public static void main(String[] args) {
        final int a=10;
        // a=20;
        System.out.println(a);

        // B obj =new B();
        A obj=new A();
        obj.show();
    }
}