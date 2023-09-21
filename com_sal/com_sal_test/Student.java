package com_sal.com_sal_test;

/*
 * If you don't assign anything or specific anything 
 * acccess modifier to a variable or function 
 * 
 * By default it becomes a package private, meaning
 * you can also use them within package and not outside of it.
 * 
 * But the files within the some package, can use the variables
 * and methods define within the classes.
 * 
 * Conclusion : 
 * Public : can be used anywhere.
 * Not assigned anything : can be used within the same package , eg :- int age = 27;
 * Private : can only be used in same class.
 * Protected : can be used in same packag / or in another package provided as subclass.
 */
public class Student {
    int age = 27;
    public int rollno = 8;

    // You can't use private things outside of the same class.
    private String name = "Salman";
    public int marks = 56;
}
