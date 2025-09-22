interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {
    private String policyNumber;
    private double insuranceRate = 0.10;

    public Car(String number, double rentalRate, String policyNumber) {
        super(number, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy No: " + policyNumber;
    }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber;
    private double insuranceRate = 0.05;

    public Bike(String number, double rentalRate, String policyNumber) {
        super(number, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy No: " + policyNumber;
    }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber;
    private double insuranceRate = 0.15;

    public Truck(String number, double rentalRate, String policyNumber) {
        super(number, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy No: " + policyNumber;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("CAR101", 2000, "C-INS-001");
        Vehicle v2 = new Bike("BIKE202", 500, "B-INS-002");
        Vehicle v3 = new Truck("TRUCK303", 5000, "T-INS-003");

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rental = v.calculateRentalCost(5);
            double insurance = 0;
            if (v instanceof Insurable) {
                insurance = ((Insurable) v).calculateInsurance();
                System.out.println(((Insurable) v).getInsuranceDetails());
            }
            System.out.println("Rental Cost for 5 days: " + rental);
            System.out.println("Insurance Cost: " + insurance);
            System.out.println("Total Payable: " + (rental + insurance));
            System.out.println("--------------------------------");
        }
    }
}
