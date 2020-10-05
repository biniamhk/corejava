package PartTenThreads;

public class ThreadDemoUsingLampda {
    public static void main(String[] args) throws Exception {
        //we are going to use Lampda expression in the previous example  and see the difference
        //we will also see Join() method and isAlive();
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("BINIAM");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("EDU");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
//######################################################
        //to know the name of thread
        System.out.println("default thread name is : "+t1.getName());
        System.out.println("default thread name is : "+t2.getName());
        //#######################################
        //change the name of Thread 2 ways 1.Thread t1=new Thread(obj1,"name of the thread" 2nd way is bellow
        t1.setName("Edu Thread");
        t2.setName("Bini Thread");
        System.out.println("new thread name is : "+t1.getName());
        System.out.println("new thread name is : "+t2.getName());
        //########################################
        //checking default priority of thread and setting it. 1 is list priority and 10 most priority
        System.out.println("default priority is : "+t1.getPriority());
        System.out.println("default priority is : "+t2.getPriority());
        t1.setPriority(1); // second way t1.setPriority(Thread.MIN_PRIORITY); t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(5);
        System.out.println("new priority is : "+t1.getPriority());
        System.out.println("new priority is : "+t2.getPriority());
        //###############################################
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        t2.start();
        // System.out.println(t1.isAlive()); used to know if thread is active or not
        t1.join();
        t2.join();
        //System.out.println(t2.isAlive());
        System.out.println("Bye");
    }

}