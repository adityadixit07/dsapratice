package Arrays;

public class MaxSumCircularSubarr{
    public static void main(String[] args) {
        int[] arr={5,-3,12};
        // here circular subarray formed {12,5} wher
        System.out.println(maxSubarraySumCircular(arr));
    }
    // https://leetcode.com/problems/maximum-sum-circular-subarray/description/
    public static int maxSubarraySumCircular(int[] arr){
        int totalsum=0;
        int maxsum=arr[0];
        int currmax=0;
        int minsum=arr[0];
        int currmin=0;
        for(int i=0;i<arr.length;i++){
            currmax=Math.max(currmax+arr[i],arr[i]);
            maxsum=Math.max(currmax,maxsum);
            currmin=Math.min(currmin+arr[i],arr[i]);
            minsum=Math.min(minsum,currmin);
            totalsum+=arr[i];
        }
        if(maxsum>0){
            return Math.max(maxsum,totalsum-minsum);
        }
        return maxsum;
    }
}


// Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

// A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

// A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 %