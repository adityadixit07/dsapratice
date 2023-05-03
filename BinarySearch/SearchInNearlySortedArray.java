package BinarySearch;


public class SearchInNearlySortedArray {
    public static void main(String[] args) {
        // given that array is nearly sorted means element can be found in 
        // ith or (i-1)th or (i+1)th position
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(findIndex(arr, 5));
    }    
    public static int findIndex(int[] arr,int target){
        // to find the index of nearly sorted array first we have to calulate the
        // index of the minimum Element in rotated sorted array then we appply
        // bianry search on left and right half of that index 
        int realmid=findIndex(arr);
        int left=binarySearch(arr, 0, realmid-1, target);
        int right=binarySearch(arr, realmid, arr.length-1, target);

        if(left==-1 && right==-1) return -1;
        if(left!=-1) return left;
        if(right!=-1) return right;
        return -1;

    }
    // finding the index of minimum element in rotated sorted array
    public static int findIndex(int[] arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;
            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
                // System.out.println("min element in sorted array is:"+arr[mid]);
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
        }System.out.println("min element in sorted array is:"+arr[0]);
        return -1;
    }
    // now binary serch 
    public static int binarySearch(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
