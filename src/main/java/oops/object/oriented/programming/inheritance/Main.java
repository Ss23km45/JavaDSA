package oops.object.oriented.programming.inheritance;

public class Main {
    public static void main(String[] args) {
        MultipleorTree multipleorTree = new MultipleorTree(59,23000);
        System.out.println(multipleorTree.weight);

        Base trree = new MultipleorTree(23400);
        Base trree1 = new Inheritance(80);

        // We Can access Base Class Variables by initializg above
        // but we cannot access child class variables by initializing above

        // Example : - System.out.println(trree.price);
        System.out.println(trree1.length);
        trree.someRandomMethod();





    }
}
