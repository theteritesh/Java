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

class C {
    public final void show(){
        System.out.println("By Ritesh");
        System.out.println("in C");
    }
}
class D extends C{
    // public void show(){
    //     System.out.println("By Another Person");
    //     System.out.println("in D");
    // }
}

public class FinalKeywordPractice {
    public static void main(String[] args) {
        final int a=10;
        // a=20;
        System.out.println(a);

        // B obj =new B();
        A obj=new A();
        obj.show();

        D obj2=new D();
        obj2.show();
    }
}