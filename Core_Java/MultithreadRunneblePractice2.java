// class First implements Runnable{
//     public void run(){
//         for (int i =0;i<=5;i++)
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//     }
// }
// class Second implements Runnable{
//     public void run(){
//         for (int i =0;i<=5;i++)
//             System.out.println("hillo");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//     }
// }
public class MultithreadRunneblePractice2 {
    public static void main(String[] args) {
        // Runnable obj1 = new First();
        // Runnable obj2 = new Second();

        Runnable obj1=()->{
            for (int i =0;i<=5;i++)
                System.out.println("hi");
                try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
        };
        Runnable obj2=()->{
            for (int i =0;i<=5;i++)
                System.out.println("hillo");
                try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
        };

        Thread t1Thread=new Thread(obj1);
        Thread t2Thread = new Thread(obj2);
        
        t1Thread.start();
        t2Thread.start();
        
    }
}
