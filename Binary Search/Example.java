🧠Java Example:
public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid; // Found
            }
            if (arr[mid] < target) {
                low = mid + 1; // Search right
            } else {
                high = mid - 1; // Search left
            }
        }
        return -1; // Not found
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        int result = binarySearch(numbers, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
