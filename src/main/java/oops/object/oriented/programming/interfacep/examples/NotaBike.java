package oops.object.oriented.programming.interfacep.examples;

public class NotaBike implements Bike {
    public void start() {
        System.out.println("This is not a Bike, Start Pedalling");
    }

    public void stop() {
        System.out.println("This is not a Bike, Stop Pedalling");
    }

    @Override
    public void isTankEmpty() {
        System.out.println("This is not a Bike, Hence Not Empty always");
    }


    public void isDieselTankEmpty() {
        System.out.println("This is not a Bike, Hence Not Empty always");
    }


    public void startPeddling() {
        System.out.println("Started Pedalling");
    }
}
