package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = { 4,10, 110, 20, 40, 15 }; // peak element is 110 return inddex of peak element
        
        System.out.println("peak element: "+findPeak(nums));
    }

    // peak eleemnt -> element greater than its neighbour
    // numsay is unsorted
    // note:- below code is not worked for duplicate peak elements
    public static int findPeak(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid > 0 && mid < n - 1) {
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                    return nums[mid];
                } else if (nums[mid] < nums[mid - 1]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else if(mid==0){
                if(nums[0]>nums[1]){
                    return nums[0];
                }
                else{
                    return nums[1];
                }
            }
            else if(mid==n-1){
                if(nums[n-1]>nums[n-2]){
                    return nums[n-1];
                }
                else{
                    return nums[n-2];
                }
            }
        }
        return -1;
    }
}
