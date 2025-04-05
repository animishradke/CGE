public class Vehicle {
    static double registrationFee = 500.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name : " + ownerName);
            System.out.println("Vehicle Type : " + vehicleType);
            System.out.println("Registration Fee : ₹" + registrationFee);
        } else {
            System.out.println("Invalid object, not a Vehicle instance.");
        }
    }
}

