class A{
    public void show(){
        System.out.println("in A show....");
    }
    public void config(){
        System.out.println("in A config....");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show....");
    }
    
}

public class MethodOverriding{
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
        obj1.config();
    }
}