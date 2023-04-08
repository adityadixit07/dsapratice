package recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 3, 7, 8, 3, 14, 2, 21, 12 };
        mergesort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergesort(int[] arr, int left, int right) {

        // when there is only single element in the array
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        // partition the left half
        mergesort(arr, left, mid);
        // partition the right half
        mergesort(arr, mid + 1, right);
        mergeArrs(arr, left, mid, right);
    }

    public static void mergeArrs(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left+1];
        int i = left;
        int j = mid + 1;
        int index=0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (index=0;index<temp.length;index++) {
            arr[left+index] = temp[index];
        }
    }
   

}
// time complexity : worst and average case :O(nlogn)
// space complexity : O(n)
