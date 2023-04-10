package oops.object.oriented.programming.polymorphism;


public class Main {


    public static void main(String[] args) {
        Shapes shapes = new Shapes();

        //Below is Called as UpCasting
        //By using Dynamic MEthod Dispatch
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes Diagnol = new Diagnol();
        Shapes triangle = new Triangle();

        shapes.print();
        circle.print();
        square.print();
        Diagnol.print();
        triangle.print();



    }


}
