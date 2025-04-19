package Level1;
import java.util.List;
import java.util.ArrayList;

 class C1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }
        System.out.println(list1);
    }
}
