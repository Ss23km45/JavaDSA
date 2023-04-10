package oops.object.oriented.programming.abstraction;

public class Daughter extends Parent{

    public Daughter(int a, int b) {
        super(a, b);
    }

    @Override
    void printName() {
        System.out.println("I Am Son of my Parent");
    }

    @Override
    void Method() {

    }
}
