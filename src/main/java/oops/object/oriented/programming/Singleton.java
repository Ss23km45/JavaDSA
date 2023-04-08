package oops.object.oriented.programming;

public class Singleton {

    static String name= "Jai Hanuman";
    //Singleton class is the one which we can in stantiate only once

    //To make it non accessble to Users we have to chnage the acess modifier to private
    //So that it will not be called defaultly, and accessble in this Class only
    private Singleton() {

    }

    //Lets create one Varibale with Singleton class name
    private static Singleton instance;

    //Now lets create one public accesble method
    public static Singleton getInstance(){
        if(instance ==null)
        {
            return new Singleton();
        }

        return instance;
    }

    @Override
    public String toString() {
        return name;
    }
}
