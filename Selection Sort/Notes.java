✅Selection Sort:
Selection Sort is a simple comparison-based sorting algorithm.
It works by repeatedly finding the minimum element (for ascending order) from the unsorted part and placing it at the beginning.
It is an in-place algorithm (does not require extra memory).

⚡Complexity
Time Complexity:
Best case: O(n²)
Average case: O(n²)
Worst case: O(n²)
(Because nested loops always run, regardless of array order.)
Space Complexity: O(1) (in-place sorting)
Stability: Not stable (equal elements may be swapped and order disturbed).

⚡Note:
n-1 means last but one element.
n means last element.

🧠Example:
public class SelectionSortExample {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        selectionSort(arr);
        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//Output:
{11,12,22,25,65}
















