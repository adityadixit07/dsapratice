package BinarySearch;

public class countOccurenceOfNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,3,4,5};
        int target=3; //occurence of 3 in array is 4 times
        // given that array is sorted  and count the occurence of duplicate number
        System.out.println(countOccuenceofDuplicate(arr, target));

    }
    public static int countOccuenceofDuplicate(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]!=target){
                left++;
            }
            if(arr[right]!=target){
                right--;
            }
            if(arr[left]==target && arr[right]==target){
                return right-left+1;
            }
        }
        return 0;
    }
    // time complexity :O(log n) space complexity:O(1)
}
