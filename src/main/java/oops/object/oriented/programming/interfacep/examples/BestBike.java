package oops.object.oriented.programming.interfacep.examples;

public class BestBike {

    private Bike bike;

    public BestBike() {
        this.bike = new NotaBike();
    }

    public BestBike(Bike bike) {
        this.bike = bike;
    }



    void start(){
        this.bike.start();
    }

    void stop(){
        this.bike.stop();
    }
     void isTankEmpty(){
         this.bike.isTankEmpty();
    }



}
