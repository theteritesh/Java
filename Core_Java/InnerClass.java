class A{
    int a;
    public void show(){
        System.out.println("In show");
    }
    class B{
        public void config(){
            System.out.println("In config");
        }
    }
    static class C{
        public void determine(){
            System.out.println("In determine");
        }
    }
}

public class InnerClass{
    public static void main(String[] args) {
        A obj = new A();   
        obj.show();
        
        A.B obj1 =obj.new B();
        obj1.config();

        A.C obj3 = new A.C();
        obj3.determine();
    }
}