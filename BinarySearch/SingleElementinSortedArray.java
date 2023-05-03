package BinarySearch;

public class SingleElementinSortedArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,8,8};
        // all element are appeared twice expect one element find that element
        System.out.println(findElement(arr));

    }
    public static int findElement(int[] arr){
        int n=arr.length;
        if(n==0) return arr[0];
        else if(arr[0]!=arr[1]) return arr[0];
        else if(arr[n-1]!=arr[n-2]) return arr[n-1];

        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }    
            else if(arr[mid]==arr[mid-1]){
                // calculate from mid to left
                int leftcount=mid-start+1;
                // if left array is even from start to mid then move to right part 
                if(leftcount%2==0){
                    start=mid+1;
                }
                else{
                    end=mid-2;
                }
            }
            else if(arr[mid]==arr[mid+1]){
                // calculte legth from mid to end
                int rightcount=end-mid+1;
                // right array is even the move to left part 
                if(rightcount%2==0){
                    end=mid-1;
                }
                else{
                    start=mid+2;
                }
            }
        }
        return -1;
    }
}
