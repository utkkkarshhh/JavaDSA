// Base class or superclass
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Derived class or subclass
class Car extends Vehicle {
    private int numOfDoors;

    // Constructor
    public Car(String brand, String model, int year, int numOfDoors) {
        super(brand, model, year); // Call superclass constructor
        this.numOfDoors = numOfDoors;
    }

    // Method to display car information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Number of Doors: " + numOfDoors);
    }

    // Method specific to Car class
    public void drive() {
        System.out.println("Driving the car...");
    }
}

// Another derived class
class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    // Constructor
    public Motorcycle(String brand, String model, int year, boolean hasSideCar) {
        super(brand, model, year); // Call superclass constructor
        this.hasSideCar = hasSideCar;
    }

    // Method to display motorcycle information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Has Sidecar: " + hasSideCar);
    }

    // Method specific to Motorcycle class
    public void ride() {
        System.out.println("Riding the motorcycle...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create objects of Car and Motorcycle
        Car myCar = new Car("Toyota", "Camry", 2021, 4);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2020, false);

        // Call methods and display information
        System.out.println("Car Information:");
        myCar.displayInfo();
        myCar.drive(); // Calling Car specific method

        System.out.println("\nMotorcycle Information:");
        myMotorcycle.displayInfo();
        myMotorcycle.ride(); // Calling Motorcycle specific method
    }
}
