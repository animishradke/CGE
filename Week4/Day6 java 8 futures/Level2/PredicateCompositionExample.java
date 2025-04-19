import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class PredicateCompositionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "kiwi", "mango", "grape");

        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;
        Predicate<String> containsSubstring = s -> s.contains("an");

        List<String> filteredStrings = strings.stream()
            .filter(lengthGreaterThan5.and(containsSubstring))
            .collect(Collectors.toList());

        System.out.println("Filtered Strings: " + filteredStrings);
    }
}
