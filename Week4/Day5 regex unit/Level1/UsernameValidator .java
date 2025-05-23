public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }

    public static void main(String[] args) {
        String[] testUsernames = {"user_123", "123user", "us"};
        for (String username : testUsernames) {
            System.out.println(username + " → " + (isValidUsername(username) ? "Valid" : "Invalid"));
        }
    }
}
