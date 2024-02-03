class A{
    public void show(){
        System.out.println("In old Show");
    }
    
}

public class AnonymousInnerClass{
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("In new Show");
            }
        };
        obj.show();
    }
}