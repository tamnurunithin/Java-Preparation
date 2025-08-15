📌Bubble Sort Example:

public class BubbleSortExample {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; 
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 8, 2};  
        System.out.println("Before Sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        bubbleSort(numbers);
        System.out.println("\n\nAfter Sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
