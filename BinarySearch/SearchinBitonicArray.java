package BinarySearch;

public class SearchinBitonicArray {
    public static void main(String[] args) {
        int[] arr = { 1,3, 8, 20, 14, 15 };
        int target = 14;
        // System.out.println(findBitonicIndex(arr));
        System.out.println(searchElement(arr, target));
    }
    // after getting the bitonic index means the peak element index we
    // will apply the incresing bs on left and decresing bs on right
    public static int searchElement(int[] arr,int target){
        int mid=findBitonicIndex(arr);
        int incresing=BS(arr, 0, mid-1, target);
        int decresing=BS(arr, mid, arr.length-1, target);
        if(incresing==-1 && decresing==-1){
            return -1;
        }
        if(incresing!=-1) return incresing;
        if(decresing!=-1) return decresing;
        return -1;
    }
    public static int findBitonicIndex(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid] > arr[mid - 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            else if(mid==0){
                if(arr[0]>arr[1]) {
                    return 0;
                }
                else {
                    return 1;
                }
            }
            else if(mid==n-1){
                if(arr[n-1]>arr[n-2]) {
                    return n-1;
                }
                else{
                    return n-2;
                }
            }
        }
        return low;
    }
    public static int BS(int[] arr,int low,int high,int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
