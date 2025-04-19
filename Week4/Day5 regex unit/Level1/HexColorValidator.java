public class HexColorValidator {
    public static boolean isValidHexColor(String color) {
        return color.matches("^#([A-Fa-f0-9]{6})$");
    }

    public static void main(String[] args) {
        String[] testColors = {"#FFA500", "#ff4500", "#123", "#GGGGGG", "FFA500"};
        for (String color : testColors) {
            System.out.println(color + " → " + (isValidHexColor(color) ? "Valid" : "Invalid"));
        }
    }
}
