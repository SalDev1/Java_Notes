package encapsulation;

/**
 * In encapsulation, we mainly
 * deal with getters and setters.
 * 
 */
class Student {
    private int rollno;
    private String name;

    // Getters and Setters.
    public int getRollNo() {
        System.out.println("user is accessing the value");
        return rollno;
    }

    public void setRollNo(int r) {
        this.rollno = r;
        System.out.println("Value of rollno changed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class demo_1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(2);
        System.out.println(s.getRollNo());
    }
}
