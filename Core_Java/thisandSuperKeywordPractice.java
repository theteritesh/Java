class A{
    public A(){
        super();
        System.out.println("in A...");
    }
    public A(int b){
        super();
        System.out.println("in a int");
    }

}
class B extends A{
    public B(){
        super();
        System.out.println("in b...");
    }

    public B(int a){
        this();
        System.out.println("in b int");
    }
}
public class thisandSuperKeywordPractice{
    public static void main(String[] args) {
        new B(6);
        // B Obj1 = new B();

    }
}