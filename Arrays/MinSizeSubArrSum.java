package Arrays;

public class MinSizeSubArrSum {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArray(arr, target)); //[4,3] gives 7
    }    
    public static int minSubArray(int[] arr,int target){
        int i=0;
        int j=0;
        int sum=0;
        int minval=Integer.MAX_VALUE;
        while(j<arr.length){
            sum+=arr[j];
            j++;
            while(sum>=target){
                minval=Math.min(minval, j-i);
                sum=sum-arr[i];
                i++;
            }
        }
        return minval==Integer.MAX_VALUE?0:minval;
    }
    
}