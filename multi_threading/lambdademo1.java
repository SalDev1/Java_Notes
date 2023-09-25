package multi_threading;

/*
 * We are learning about join and main method + thread Priority
 * 
 * If we want the main method to allow the obj1 and obj2 to 
 * complete their task and then execute / print "Bye".
 * 
 * Then join method , will help us achieve it.
 * 
 * If you want to check if threads are alive or not 
 * , use the alive method.
 * 
 * Use setName and getName to do some operations with the Thread.
 * 
 * Whenever you create a thread , there is always a default priority.
 * Priority lies in the range [1,10] 
 * 1 --> is the least priority.
 * 5 --> normal priority
 * 10 --> is the highest priority.
 * 
 * setPriority , getPriority can be used to deal with this.
 */

public class lambdademo1 {
    public static void main(String[] args) throws Exception {
        Runnable obj1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // t1.setName("Hi Thread");
        // t2.setName("Hello Thread");
        // System.out.println(t1.getName());
        // System.out.println(t2.getName());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
};