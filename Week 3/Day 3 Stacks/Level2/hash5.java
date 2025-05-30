import java.util.HashMap;

public class hash5 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);  // store value and index
        }

        return new int[] {}; // if no solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
