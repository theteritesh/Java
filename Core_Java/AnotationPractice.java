class A{
    public void show(){
        System.out.println("HEY");
    }

}
class B extends A{
    @Override
    public void show(){
        System.out.println("Hi");
    }
}
public class AnotationPractice{
    public static void main(String[] args) {
        B obj =new B();
        obj.show();       
    }
}