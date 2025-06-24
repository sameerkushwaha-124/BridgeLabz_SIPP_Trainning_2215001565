// Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details 
// and calculate total cost.
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    public CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public int calculateTotalCost(){
        return rentalDays * 100;
    }

    public static void main(String[] args) {
        CarRental carRental = new CarRental("John Doe", "Toyota Camry", 5);
        System.out.println("Customer Name: " + carRental.customerName);
        System.out.println("Car Model: " + carRental.carModel);
        System.out.println("Rental Days: " + carRental.rentalDays);
        System.out.println("Total Cost: $" + carRental.calculateTotalCost());
    }
}
