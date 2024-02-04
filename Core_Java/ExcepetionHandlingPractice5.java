class A {
    public void show() throws ClassNotFoundException {
        Class.forName("ExcepetionHandlingPractice5");
    }
}

public class ExcepetionHandlingPractice5 {
    static {
        System.out.println("Class loaded");
    }

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        
    }
}