package multi_threading;

/*
 * Let's learn about runnable interface in multithreading.
 * 
 * Runnable Interface --> Functional Interface.
 */
class Hi implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                // This function will make sure that output is printed
                // after 500 milliseconds.
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

class Hello implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}

public class runnabledemo {
    public static void main(String[] args) {
        Hi obj1 = new Hi(); // runnable object
        Hello obj2 = new Hello(); // runnable object

        // Converting runnable object into thread.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
        t2.start();
    }
}
