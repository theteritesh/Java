class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class MultithreadMutationPractice3 {
    public static void main(String[] args) throws InterruptedException {
        // Runnable obj1 = new First();
        // Runnable obj2 = new Second();
        Counter c=new Counter();

        Runnable obj1=()->{
            for (int i =0;i<=10000;i++){
                c.increment();
            }
        };
        Runnable obj2=()->{
            for (int i =0;i<=10000;i++){
                c.increment();
            }
        };

        Thread t1Thread=new Thread(obj1);
        Thread t2Thread = new Thread(obj2);
        
        t1Thread.start();
        t2Thread.start();

        t1Thread.join();
        t2Thread.join();
        System.out.println(c.count);
        
    }
}

