package Level1;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class c3 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotate = 2;
        List<Integer> rotated = new ArrayList<>();
        int n = list.size();

        for (int i = rotate; i < n; i++) {
            rotated.add(list.get(i));
        }

        for (int i = 0; i < rotate; i++) {
            rotated.add(list.get(i));
        }

        System.out.println("Rotated List: " + rotated);
    }
}
