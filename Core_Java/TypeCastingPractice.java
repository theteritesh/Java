class A{
    public void show1(){
        System.out.println("in A show");
    }
    
}
class B{
    public void show2(){
        System.out.println("in B show");
    }
}
public class TypeCastingPractice{
    public static void main(String[] args) {

        B obj1 =new B();  //upcasting
        obj1.show2();

        B obj2=(B)obj1; //downcasting
        obj2.show2();
        
    }
}