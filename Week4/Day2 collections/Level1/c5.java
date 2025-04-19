package Level1;
import java.util.LinkedList;
public class c5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int N = 2;
        String result = findNthFromEnd(list, N);

        if (result != null) {
            System.out.println("Nth element from end: " + result);
        } else {
            System.out.println("N is larger than the list size.");
        }
    }
    public static String findNthFromEnd(LinkedList<String> list, int N) {
        int first = 0, second = 0;
        while (first < N) {
            if (second >= list.size()) return null;
            first++;
            second++;
        }
        int start = 0;
        while (second < list.size()) {
            start++;
            second++;
        }
        return list.get(start); 
    }
}

