import java.util.function.*;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, String, String> concatenateStrings = (s1, s2) -> s1 + " " + s2;

        String result = concatenateStrings.apply("Hello", "World");

        System.out.println("Concatenated String: " + result);
    }
}
