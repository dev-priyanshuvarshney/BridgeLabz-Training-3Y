interface Refuelable {
    void refuel();
}

class Vehicle {
    String modelName;
    int topSpeed;

    Vehicle(String modelName, int topSpeed) {
        this.modelName = modelName;
        this.topSpeed = topSpeed;
    }

    void showInfo() {
        System.out.println("Model: " + modelName);
        System.out.println("Max Speed: " + topSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    ElectricVehicle(String modelName, int topSpeed, int batteryCapacity) {
        super(modelName, topSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        showInfo();
        System.out.println("Type: Electric Vehicle");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Action: Charging the battery...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    double fuelTankSize;

    PetrolVehicle(String modelName, int topSpeed, double fuelTankSize) {
        super(modelName, topSpeed);
        this.fuelTankSize = fuelTankSize;
    }

    public void refuel() {
        showInfo();
        System.out.println("Type: Petrol Vehicle");
        System.out.println("Fuel Tank Size: " + fuelTankSize + " liters");
        System.out.println("Action: Refueling the petrol tank...");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 40);

        ev.charge();
        System.out.println();
        pv.refuel();
    }
}
