package oops.object.oriented.programming.abstraction;

public class Main{
    public static void main(String[] args) {
        Parent son = new Son();
        Parent daughter = new Daughter(3,5);

        son.printName();
        daughter.printName();

        Parent Father = new Parent(4,2) {
            @Override
            void printName() {
                System.out.println("I am the Father of my Son and my Daughter");
            }

            @Override
            void Method() {
                System.out.println("I am Method coming from Parent Class");
            }
        };

        Father.printName();
        //Parent.printName();
        Father.Method();
    }

}
