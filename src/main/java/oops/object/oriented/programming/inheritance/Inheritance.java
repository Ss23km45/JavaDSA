package oops.object.oriented.programming.inheritance;

public class Inheritance extends Base{
    //InHertance is the process child class utilizing/implementing all the properties from its base class
    // along with properties/methods of its own.
    //Lets Extend the BAse here
    //We Should use extends for inheritance

    //No for this class i need few more properties
    int weight;

    Inheritance() {
        this.weight = -1;
    }


     Inheritance(int weight) {
        this.weight = weight;
    }

    //below super will be poining to the Base Class we created
     Inheritance(int length, int height, int width, int weight) {
        super(length, height, width);
        this.weight = weight;
    }

     Inheritance(Base base, int weight) {
        super(base);
        this.weight = weight;
    }

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        //Ho below is giviing values of length and widhth ithout we initiaize cause of inheritance
        System.out.println(inheritance.weight);
        System.out.println(inheritance.height);
        System.out.println(inheritance.length);
        System.out.println(inheritance.width);

        System.out.println("##################################");

        //Let create constructor
        Inheritance inheritance3 = new Inheritance(13);

        System.out.println(inheritance3.weight);
        System.out.println(inheritance3.height);
        System.out.println(inheritance3.length);
        System.out.println(inheritance3.width);

        System.out.println("##################################");
        //Working with them
        Inheritance inheritance2 = new Inheritance(23,45,67,13);

        System.out.println(inheritance2.weight);
        System.out.println(inheritance2.height);
        System.out.println(inheritance2.length);
        System.out.println(inheritance2.width);

        System.out.println("##################################");

        Inheritance inheritance4 = new Inheritance(inheritance2, inheritance2.weight);

        System.out.println(inheritance2.weight);
        System.out.println(inheritance2.height);
        System.out.println(inheritance2.length);
        System.out.println(inheritance2.width);

        Base inheritance5 = new Inheritance(inheritance4, 34);

    }


}
