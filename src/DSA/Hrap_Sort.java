package DSA;

public class Heap_Sort {

    // Function to perform heap sort
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        
    }

    // Heapify subtree rooted at index i
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;       // Initialize largest as root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify affected subtree
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};

        System.out.println("Original array:");
        printArray(arr);

        heapSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Utility function to print array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}