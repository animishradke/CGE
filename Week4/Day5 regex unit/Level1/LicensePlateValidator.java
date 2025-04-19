public class LicensePlateValidator {
    public static boolean isValidPlate(String plate) {
        return plate.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public static void main(String[] args) {
        String[] testPlates = {"AB1234", "A12345", "XY9876", "abc123", "AB12"};
        for (String plate : testPlates) {
            System.out.println(plate + " → " + (isValidPlate(plate) ? "Valid" : "Invalid"));
        }
    }
}
