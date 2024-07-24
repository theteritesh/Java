// class A implements Runnable{
//     public void run(){
//         for (int i=0;i<5;i++){
//             System.out.println("hi");
//             try {Thread.sleep(10);}catch (Exception e) {System.out.println(e);}
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for (int i=0;i<5;i++){
//             System.out.println("hellow");
//             try {Thread.sleep(10);}catch (Exception e) {System.out.println(e);}
//         }
//     }
// }

public class MultithreadRunneblePractice2 {
    public static void main(String[] args) {
        Runnable obj1=()->{
            for (int i =0;i<=5;i++){
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        Runnable obj2=()->{
            for (int i =0;i<=5;i++){
                System.out.println("hellow");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };

        Thread t1Thread=new Thread(obj1);
        Thread t2Thread = new Thread(obj2);
        
        t1Thread.start();
        t2Thread.start();
        
    }
}
    
    