public class RotationPointFinder {

    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int index = findRotationPoint(arr);
        System.out.println(index); // Output: 4 (index of smallest element 0)
    }
}

