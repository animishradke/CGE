import java.util.*;
import java.util.stream.*;

public class OptionalHandlingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> maxNumber = numbers.stream()
                                             .max(Integer::compareTo);

        System.out.println("Max Value: " + maxNumber.orElseGet(() -> {
            System.out.println("List is empty, returning default value.");
            return -1;
        }));
    }
}
