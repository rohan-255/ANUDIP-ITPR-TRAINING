class Vehicle{
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car1 extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

class MotorCycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started");
    }
}

class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car1 car = new Car1();
        MotorCycle motorcycle = new MotorCycle();
        Garage garage = new Garage();
        garage.serviceVehicle(car);
        garage.serviceVehicle(motorcycle);
    }
}
