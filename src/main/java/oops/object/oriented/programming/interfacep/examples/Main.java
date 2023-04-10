package oops.object.oriented.programming.interfacep.examples;

public class Main {
    public static void main(String[] args) {
        BestBike bike = new BestBike();
        bike.start();
        bike.stop();
        bike.isTankEmpty();


       BestBike bike2 = new BestBike(new PetrolBike());
        bike2.start();
        bike2.stop();
        bike2.isTankEmpty();


        BestBike bike3 = new BestBike(new DieselBike());
        bike3.start();
        bike3.stop();
        bike3.isTankEmpty();


        BestBike bike4 = new BestBike(new ElectricBike());
        bike4.start();
        bike4.stop();
        bike4.isTankEmpty();


    }
}
