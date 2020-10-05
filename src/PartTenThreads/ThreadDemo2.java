package PartTenThreads;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable obj1 = new Hii();  //here we create object using interface but we canlike Hii obj1=new Hii();
        Runnable obj2 = new Helloo();// we can not say obj1.start like previous demo bc runnable interface have no start method
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}

class Hii implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("EdU");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }
}

class Helloo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Biniam");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }

}