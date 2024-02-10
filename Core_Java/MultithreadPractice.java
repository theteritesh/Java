
class HII extends Thread{
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class HELLO extends Thread{
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class MultithreadPractice {
    public static void main(String[] args) {
        HII hi = new HII();
        HELLO hel=new HELLO();
        // hi.setPriority(Thread.MAX_PRIORITY);
        System.out.println(hi.getPriority());
        hi.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hel.start();
        
        
    }
    
}
