package oops.object.oriented.programming.inheritance;

public class MultipleorTree extends Inheritance{
    int Price;

    public MultipleorTree(int price) {
        super();
        Price = price;
    }

    public MultipleorTree(int weight, int price) {
        super(weight);
        Price = price;
    }

    public MultipleorTree(int length, int height, int width, int weight, int price) {
        super(length, height, width, weight);
        Price = price;
    }

    public MultipleorTree(Base base, int weight, int price) {
        super(base, weight);
        Price = price;
    }

    @Override
    void someRandomMethod(){
        System.out.println("Hello Am i Coming when you initalize with Base Class ?????" +
                "Yahooo..! Am Coming");
    }


}
