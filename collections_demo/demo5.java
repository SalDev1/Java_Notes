package collections_demo;

import java.util.List;

/*
 * In this , we learn about comparator object 
 * and comparator class.
*/
class Stud implements Comparable {
    int rollno, marks;
    String name;

    public Stud(int rollno, int marks, String name) {
        super();
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "";
    }

    public int compareTo(Stud s) {
        return marks > s.marks ? 1 : -1;
    }
};

public class demo5 {
    // Everything will be sorted according to the marks.

    // List<Stud> studs = new ArrayList<>();
    // studs.add(new Stud(23,55,"Mahesh"));
    // studs.add(new Stud(24,64, "Sony"));
    // studs.add(new Stud(25,25,"Larry"));
    // studs.add(new Stud(26,36,"Joseph"));

    // Collection.sort(studs);

    // for(Stud s : studs) {
    // System.out.println(s);
    // }
}
