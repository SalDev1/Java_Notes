package multi_threading;

class Hi extends Thread {
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

// This function will make sure that output is printed
// after 500 milliseconds.

/*
 * By doing this , it lets other method to wait
 * for some time.
 * 
 * But it is better to execute them in parallel rather than
 * executing them one by one , leading to consuming a lot of time.
 * 
 * We can achieving this by extending each class with Thread + the class
 * becomes a thread.
 */
class Hello extends Thread {
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

public class threaddemo1 {
    public static void main(String[] args) {
        // System.out.print("Good");

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        obj2.start();

    }
}

/*
 * Normally , if you wrote something and you want to
 * execute it , it is been handled by the main thread.
 * 
 * When we called the start method from a Thread , it calls
 * run method to achieve parallel execution , convert show to run method.
 * 
 * Scheduler will consider random order when both threads want to execute
 * themselves in same manner.
 */