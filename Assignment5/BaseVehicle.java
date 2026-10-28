package Assignment5;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void displayType() {
        System.out.println("Type: Car");
    }
}

class Bike extends Vehicle {
    void displayType() {
        System.out.println("Type: Bike");
    }
}

public class BaseVehicle {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayType();
        myCar.start();
        myCar.stop();

        System.out.println();

        Bike myBike = new Bike();
        myBike.displayType();
        myBike.start();
        myBike.stop();
    }
}