package recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={3,2,6,8,4,7,2,8,9};
    }
    public static void quicksort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int partitionIndex=partition(arr,low,high);
        quicksort(arr, low, partitionIndex-1);
        quicksort(arr, partitionIndex+1, high);
        return;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
        }
        return 1;
    }
}
