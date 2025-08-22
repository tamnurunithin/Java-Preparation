public class QuickSort {
    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition index
            int pi = partition(arr, low, high);
            // Recursively sort elements
            quickSort(arr, low, pi - 1);  // Left subarray
            quickSort(arr, pi + 1, high); // Right subarray
        }
    }
    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1;       // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap pivot into correct place
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Pivot index
    }
    // Main method
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Before Sorting:");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        quickSort(arr, 0, n - 1);

        System.out.println("After Sorting:");
        for (int num : arr) System.out.print(num + " ");
    }
}