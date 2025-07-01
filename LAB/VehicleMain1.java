class Vehicle2 {
    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle2(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println("Driving a vehicle");
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Maximum Speed: " + maximumSpeed + " km/h");
    }
}

class Car2 extends Vehicle2 {
    public Car2(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving");
    }
}

class Bike2 extends Vehicle2 {
    public Bike2(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}

class VehicleMain1 {
    public static void main(String[] args) {
        Car2 car = new Car2("Toyota", "Corolla", 2020, 180);
        Bike2 bike = new Bike2("Yamaha", "MT-07", 2021, 200);

        System.out.println("Car Details:");
        car.display();
        car.drive();

        System.out.println("\nBike Details:");
        bike.display();
        bike.drive();
    }
}
