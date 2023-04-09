package oops.object.oriented.programming;

public class Main {
    public static void main(String[] args) {
        Object_Class object_class = new Object_Class();
        /*Since we created an Object it will call the default constructor
        present in that class without any arguments */
        System.out.println(object_class.Name);
        System.out.println(object_class.rollNo);
        System.out.println(object_class.marks);

        //If you check the class there is another constructor with args lets call that as well

        Object_Class object_class2 = new Object_Class(23,"Mukesh Ch", 93);
        System.out.println(object_class2.Name);
        System.out.println(object_class2.rollNo);
        System.out.println(object_class2.marks);

        Object_Class object_class3 = new Object_Class(22, "Kedhar Ch", 94);
        object_class3 = new Object_Class(object_class2);

        System.out.println(object_class3.Name);
        System.out.println(object_class3.rollNo);
        System.out.println(object_class3.marks);

        //Final
        final int number = 8353;

        //Caling Garbage collection
        for (int i = 0; i < 1000000000; i++) {
            object_class3 = new Object_Class();
        }


    }
}
