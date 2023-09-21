package interface_demo;

/**
 * We learn more about interfaces.
 */
interface Abc {
    void show();
}

class I implements Abc {
    public void show() {
        System.out.println("Anything");
    }
}

public class demo2 {
    public static void main(String[] args) {
        Abc obj = new I();
        obj.show();
    }
}
