package synchorization;

/**
 * The main idea behind using synchorizned keyword.
 * 
 * When two threads are doing the addition in the same time ,
 * It is creating a issue.
 * 
 * What I want to achieve is if T1 is executing , no T2 allowed.
 * if T2 is executing , no T1 allowed.
 */

class Counter {
    int count;

    public synchronized void increment() {
        count++; // count = count + 1.
    }
}

public class syncdemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        // c.increment();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count " + c.count);
    }
}
