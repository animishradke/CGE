public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 50.0;  // Fixed daily rate

    // Default constructor
    public CarRental() {
        this.customerName = "Customer";
        this.carModel = "Basic";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}
