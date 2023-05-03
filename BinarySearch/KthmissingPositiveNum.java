package BinarySearch;

public class KthmissingPositiveNum {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        System.out.println(KthMissing(arr, 5));
    }
    public static int KthMissing(int[] arr,int k){
        int low=0;
        int high=arr.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]-(mid+1)>=k){
                high=mid;
            }
            else{
            low=mid+1;
            }
        }
        return (low+k);
    }
}
// Input: arr = [2,3,4,7,11], k = 5
// Output: 9
// Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
