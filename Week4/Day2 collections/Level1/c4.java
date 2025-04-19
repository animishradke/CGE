package Level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class c4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}

