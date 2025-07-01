// Problem 3: Vehicle Registration
// Create a Vehicle class to manage the details of vehicles:
// Instance Variables: ownerName, vehicleType.
// Class Variable: registrationFee (fixed for all vehicles).
// Methods:
// An instance method displayVehicleDetails() to display owner and vehicle details.
// A class method updateRegistrationFee() to change the registration fee.

public class Vehicle{
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 1000.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }
    public static double getRegistrationFee() {
        return registrationFee;
    }   
    public static void main(String args[]){
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Bike");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        System.out.println("Current Registration Fee: " + Vehicle.getRegistrationFee());
        
        Vehicle.updateRegistrationFee(1200.0);
        System.out.println("Updated Registration Fee: " + Vehicle.getRegistrationFee());
    }
}