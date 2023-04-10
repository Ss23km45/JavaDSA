package oops.object.oriented.programming.interfacep;

public class Base implements Basic, Intermediate,Advanced{
    @Override
    public void print() {

    }

    @Override
    public void print1() {

    }

    @Override
    public void printnot() {

    }



    @Override
    public void printmyName() {

    }

    @Override
    public void printmybroName() {

    }

    @Override
    public void printmyparentsname() {

    }

    public static void main(String[] args) {
        Base base = new Base();
        System.out.println(Intermediate.getMyName(34));
    }
}
