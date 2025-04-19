package Level1;

import java.util.*;

public class c2 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        System.out.println(list);

        Map<String, Integer> e = new HashMap<>();
        for (String word : list) {
            if (e.containsKey(word)) {
                e.put(word, e.get(word) + 1);
            } else {
                e.put(word, 1);
            }
        }

        System.out.println(e);
    }
}
