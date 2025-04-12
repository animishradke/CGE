import java.util.HashSet;

public class hash2 {

public static boolean hasPairWithSum(int[] arr, int target) {
HashSet&lt;Integer&gt; set = new HashSet&lt;&gt;();

for (int num : arr) {
int complement = target - num;

if (set.contains(complement)) {
return true;
}
set.add(num);
}

return false;
}

public static void main(String[] args) {
int[] arr = {10, 15, 3, 7};
int target = 17;

System.out.println(hasPairWithSum(arr, target)); // true (10 + 7)
}
}