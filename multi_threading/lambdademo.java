package multi_threading;

/*
 * If there exists a class , that is been executed 
 * only once then why to create a seperate whole class 
 * for it + also leading to adding more extra code. 
 * 
 * The way to deal with this , is to make use of anomoyous 
 * function. 
 * 
 */

public class lambdademo {
    public static void main(String[] args) {
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

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
        t2.start();
    }
}
