package PartTenThreads;
/*
Thread with extend Thread class
 */
public class Threaddemo1 {
    public static void main(String[] args) {
        Hi objhi = new Hi();
        Hello objHello = new Hello();
        //both call is main Thread 1
        //objhi.show();   1
        //objHello.show();  1
        //we change show method with Run method
        //now we are going to start two threads  by extending  2
        // Thread to the two class now the two class become thread 2
        objhi.start();
        objHello.start();

    }
}

class Hi extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}
