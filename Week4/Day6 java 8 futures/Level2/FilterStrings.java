import java.util.*;
import java.util.stream.*;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Grapes");

        List<String> filteredStrings = strings.stream()
            .filter(s -> !s.startsWith("A"))
            .collect(Collectors.toList());
        filteredStrings.forEach(System.out::println);
    }
}
