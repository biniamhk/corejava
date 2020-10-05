package PartTenThreads;

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter obj=new Counter();
        Thread t1=new Thread(()->{for(int i=0;i<100000;i++){
            obj.increment();

        }});
        Thread t2=new Thread(()->{for(int i=0;i<100000;i++){
            obj.increment();

        }});
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count is : "+obj.count);

    }
}
class Counter{
    int count;
    //the synchronized keyword is used for another thread to block processing untill the one already started
    //finished its work
    public synchronized void increment(){
        count++;

    }
}
