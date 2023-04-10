package oops.object.oriented.programming.interfacep.examples;

public class AmazonBike{

    public void start() {
        System.out.println("This is not a Bike, Start Pedalling");
    }

    public void stop() {
        System.out.println("This is not a Bike, Stop Pedalling");
    }


    public void isDieselTankEmpty() {
        System.out.println("This is not a Bike, Hence Not Empty always");
    }


    public void startPeddling() {
        System.out.println("Started Pedalling");
    }

    public static class HayaBusaDiesel{

        public void start() {
            System.out.println("Busa Diesal Bike Started...!");
        }


        public void stop() {
            System.out.println("Busa Diesal Bike Stopped...!");
        }


        public void isDieselTankEmpty() {
            System.out.println("Diesel not Empty Go OON...!");
        }
    }

    public static class TataElectric{

        public void start() {
            System.out.println("Tata Electric Bike Started...!");
        }


        public void stop() {
            System.out.println("Tata Electric Bike Stopped...!");
        }


        public void isPetrolTankEmpty() {
            System.out.println("Tata Petrol Bike if Fulll...!");
        }


        public void isBatteryEmpty() {
            System.out.println("Tata Electric Bike if Fulll...!");
        }
    }

    public static class SkodaPetrol{

        public void start() {
            System.out.println("Skoda Petrol Bike Started...!");
        }


        public void stop() {
            System.out.println("Skoda Petrol Bike Started...!");
        }


        public void isPetrolTankEmpty() {
            System.out.println("Skoda Petrol Bike tank not empty go ONNNN...!");
        }
    }
}
