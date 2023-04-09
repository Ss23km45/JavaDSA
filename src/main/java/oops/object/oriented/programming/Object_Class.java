package oops.object.oriented.programming;

public class Object_Class {
    /*
        below Global Variable are instance Variables
     */
    int rollNo;
    String Name;
    float marks;
    /*
       Default Constructor
       Below is default one we dont need to mention in class
       untill and unless if you want to specify default Values to it
    */
    Object_Class () {
        this ( 24,"Gam Ganapathi",100 );
        this.rollNo = 24;
        this.Name = "Gam Ganapathi";
        this.marks = 100;

    }

    /*
        Method Overloading with args
     */
    Object_Class (int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.Name = name;
        this.marks = marks;

    }

    /*
        Method Overloading with Object
     */
   Object_Class(Object_Class object_class) {
        this.rollNo = object_class.rollNo;
        this.Name = object_class.Name;
        this.marks = object_class.marks;
    }

    /*
        below method will be called when the heap memory needs to clean
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}
