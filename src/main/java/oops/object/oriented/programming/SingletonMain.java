package oops.object.oriented.programming;

public class SingletonMain {

    public static void main(String[] args) {
        //this will throw error because constructor is not public
        //Singleton singleton = new Singleton();

        //our logic will check for null or not if not null it will return same object
        //Run it in debug mode to understand more.

        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);System.out.println(singleton);


    }
}
