package oops.object.oriented.programming.inheritance;

public class Base {
    //This is a Base Class of anything like for example creature, a Box, ...etc which has default properties.
    //Lets Take a Box it has lenght, height and width

    int length;
    int height;
    int width;

    //Default if we do not pass any arguments

     Base() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    //Constructor when we pass arguments while creating object
     Base(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }


    //Constructor when base has been passed in arguments
    Base(Base base) {
        this.length = base.length;
        this.height = base.height;
        this.width = base.width;
    }
    void someRandomMethod(){
        System.out.println("With Base Class ?????");
    }

}
