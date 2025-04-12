import java.util.HashMap;

public class hash1 {
    public static void findZeroSumSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) {
                System.out.println("Zero-sum subarray found from index 0 to " + i);
                return;
            }
            if (map.containsKey(sum)) {
                int startIndex = map.get(sum) + 1;
                System.out.println("Zero-sum subarray found from index " + startIndex + " to " + i);
                return;
            }
            map.put(sum, i);
        }

        System.out.println("No zero-sum subarray found.");
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        findZeroSumSubarray(arr); 
    }
}
