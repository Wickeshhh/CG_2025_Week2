package Inheritance;
class Vehicle{
    private double maxSpeed;
    private String fuelType;
    public Vehicle(double maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public String getFuelType(){
        return fuelType;
    }
    public void displayInfo(){
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle{
    private int numberOfDoors;
    private int seatCapacity;
    public Car(double maxSpeed, String fuelType, int numberOfDoors, int seatCapacity){
        super(maxSpeed, fuelType);
        this.numberOfDoors = numberOfDoors;
        this.seatCapacity = seatCapacity;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    public int getSeatCapacity(){
        return seatCapacity;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
class Truck extends Vehicle{
    private int SeatCapacity;
    private double loadCapacity;
    public Truck(double maxSpeed, String fuelType, int SeatCapacity, double loadCapacity){
        super(maxSpeed, fuelType);
        this.SeatCapacity = SeatCapacity;
        this.loadCapacity = loadCapacity;
    }
    public int getSeatCapacity(){
        return SeatCapacity;
    }
    public double getLoadCapacity(){
        return loadCapacity;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: " + SeatCapacity);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
class Motorcycle extends Vehicle{
    private int seatCapacity;
    private String type;
    public Motorcycle(double maxSpeed, String fuelType, int seatCapacity, String type){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
        this.type = type;
    }
    public int getSeatCapacity(){
        return seatCapacity;
    }
    public String getType(){
        return type;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("Type: " + type);
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(180, "Petrol");
        vehicle.displayInfo();
        System.out.println();
        Car car = new Car(220, "Diesel", 4, 5);
        car.displayInfo();
        System.out.println();
        Truck truck = new Truck(120, "Diesel", 2, 10);
        truck.displayInfo();
        System.out.println();
        Motorcycle motorcycle = new Motorcycle(150, "Petrol", 2, "Sport");
        motorcycle.displayInfo();
        System.out.println();
    }
}
