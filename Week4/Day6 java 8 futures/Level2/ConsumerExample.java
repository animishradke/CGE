import java.util.*;
import java.util.function.*;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "kiwi", "mango");

        Consumer<String> printUppercase = s -> System.out.println(s.toUpperCase());

        strings.forEach(printUppercase);
    }
}
