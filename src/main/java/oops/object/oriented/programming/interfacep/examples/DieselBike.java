package oops.object.oriented.programming.interfacep.examples;

public class DieselBike implements Bike{

    public void start() {
        System.out.println("Busa Diesal Bike Started...!");
    }


    public void stop() {
        System.out.println("Busa Diesal Bike Stopped...!");
    }

    @Override
    public void isTankEmpty() {
        System.out.println("Diesel not Empty Go OON...!");
    }


    public void isDieselTankEmpty() {
        System.out.println("Diesel not Empty Go OON...!");
    }

}
