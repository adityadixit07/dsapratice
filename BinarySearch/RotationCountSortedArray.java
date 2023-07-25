package BinarySearch;

public class RotationCountSortedArray {
    public static void main(String[] args) {
        int[] arr={11,14,14,15,2,5,6};
        // total rotation counts:5
        System.out.println("Total rotation Counts in array:"+RotationCount(arr));
    }
    //logic: rotation count is simply equal to the index of the minelement
    public static int RotationCount(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                System.out.println("min element in sorted array is:"+arr[mid]);
                return mid;
            }
            // if arr[mid]<=arr[end] then it means that right half is sorted
             else if(arr[mid]<=arr[end]){
                end=mid-1;
            }
            // if arr[mid]>=arr[start] then it means that left half is sorted
            else{
                start=mid+1;
            }
        }
        System.out.println("min element in sorted array is:"+arr[0]);
        return 0;
    }
}
