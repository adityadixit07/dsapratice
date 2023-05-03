package BinarySearch;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,5,5,5,6,7,8};
        System.out.println("First occurence:"+firstOccurence(arr, 5));
        System.out.println("Last occurence"+lastOccurence(arr, 5));
    }
    // given that array is sorted find the first and last occurence of the given element
    public static int firstOccurence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int lastOccurence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
