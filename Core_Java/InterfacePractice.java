interface A{
    int age =22;    //final and Static
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}
class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
    }

}

public class InterfacePractice{
    public static void main(String[] args) {
        B obj =new B();
        obj.show();
        obj.config();
        obj.run();
        System.out.println(A.age);
    }
}