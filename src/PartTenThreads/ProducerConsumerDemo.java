package PartTenThreads;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
    }
}


class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}


class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "consumer");
        t.start();
    }

    public void run() {
        while (true) {
            q.getNum();
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        }
    }
}
class Q {
    int num;
    boolean valueset = false;

    public synchronized void setNum(int num) {
        //if we set we must wait
        while (valueset){
          try{  wait();}catch (Exception e){}
        }
        this.num = num;
        System.out.println("put: " + this.num);
        valueset=true;
        notify();
    }

    public synchronized void getNum() {
        while(!valueset){try{  wait();}catch (Exception e){}
        }
        System.out.println("get: " + num);
        valueset=false;
        notify();
    }
}