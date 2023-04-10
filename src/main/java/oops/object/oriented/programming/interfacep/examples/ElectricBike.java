package oops.object.oriented.programming.interfacep.examples;

public class ElectricBike implements Bike{
    public void start() {
        System.out.println("Electric Bike Started...!");
    }


    public void stop() {
        System.out.println("Electric Bike Stopped...!");
    }

    @Override
    public void isTankEmpty() {
        System.out.println("Battery not Empty Go OON...!");
    }


    public void isBatteryTankEmpty() {
        System.out.println("Battery not Empty Go OON...!");
    }

}
