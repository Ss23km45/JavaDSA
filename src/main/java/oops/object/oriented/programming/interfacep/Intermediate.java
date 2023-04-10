package oops.object.oriented.programming.interfacep;

import oops.object.oriented.programming.abstraction.Parent;

public interface Intermediate extends Advanced {
    public void print1();
    public void printnot();

    public static String getMyName(String Name){

        return Name;
    }

    public static int getMyName(int Name){
        System.out.println("I am in Interface");
        return Name;
    }
}
