package oops.object.oriented.programming.abstraction;

import oops.object.oriented.programming.inheritance.singleInh.SingleInheritance;

public abstract class Parent extends SingleInheritance {

    public Parent(int a, int b) {
        super(a, b);
    }

    abstract void printName();

    abstract void Method();

}
