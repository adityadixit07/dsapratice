
// package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
        quicksort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    // qucik sort is an inplace sorting algorithm.
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionElement(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    public static int partitionElement(int[] arr, int low, int high) {
        int pivot = arr[high]; // taking the pivot as the the last element of the array
        int i = low - 1; // index of smaller element and indicates the right positon
        // found so far.
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap i,j
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
