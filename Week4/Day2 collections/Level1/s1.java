package Level1;
import java.util.*;

public class s1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        if (set1.equals(set2)) {
            System.out.println("Both sets are equal.");
        } else {
            System.out.println("Sets are not equal.");
        }
    }
}
