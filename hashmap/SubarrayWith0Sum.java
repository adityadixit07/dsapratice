import java.util.HashSet;

public class SubarrayWith0Sum{
    public static void main(String[] args) {
        int[] arr={4,2,-3,1,6};
        System.out.println(ispresent(arr));
        System.out.println(isPresentSubarr(arr));
    }
    // subarray with zero sum {2,-3,1};
    public static boolean ispresent(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        set.add(0);
        for(int val:arr){
            sum+=val;
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    // another approach using two pointer
    public static boolean isPresentSubarr(int[] arr){
        int left=0;
        int right=0;
        int sum=0;
        while(left<arr.length){
            sum+=left;
            while(sum>0 && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==0)return true;
            right++;
        }
        return false;
    }
}