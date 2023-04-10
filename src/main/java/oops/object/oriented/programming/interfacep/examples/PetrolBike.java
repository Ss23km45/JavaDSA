package oops.object.oriented.programming.interfacep.examples;

public class PetrolBike implements Bike {


    public void start() {
        System.out.println(" Petrol Bike Started...!");
    }


    public void stop() {
        System.out.println("Petrol Bike Stopped...!");
    }

    @Override
    public void isTankEmpty() {
        System.out.println("Petrol not Empty Go OON...!");
    }
    public void isDieselTankEmpty() {
        System.out.println("Diesel not Empty Go OON...!");
    }
}
