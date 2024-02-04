@FunctionalInterface
interface A{
    void show();
    // void run();


}
class B implements A{
    public void show(){
        System.out.println("Hi");
    }
    // public void run(){
    //     System.out.println("Hi");
    // }
}
public class AnotationPractice2{
    public static void main(String[] args) {
        B obj =new B();
        obj.show();       
    }
}