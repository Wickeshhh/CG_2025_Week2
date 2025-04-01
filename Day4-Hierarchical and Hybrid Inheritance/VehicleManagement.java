package Inheritance;
// Superclass: Vehicle
class Vehicle {
    protected String model;
    protected int maxSpeed;
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public void drive() {
        System.out.println(model + " is driving at a maximum speed of " + maxSpeed + " km/h.");
    }
}
// Interface: Refuelable
interface Refuelable {
    void refuel();  // Abstract method to be implemented by PetrolVehicle
}
// Subclass: ElectricVehicle (Extends Vehicle)
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }
    public void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }
}
// Subclass: PetrolVehicle (Extends Vehicle & Implements Refuelable)
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }
    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Fuel capacity: " + fuelCapacity + " liters.");
    }
}
// Main Class
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);
        ev.drive();
        ev.charge();
        System.out.println();
        pv.drive();
        pv.refuel();
    }
}
