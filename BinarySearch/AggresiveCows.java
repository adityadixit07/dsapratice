package BinarySearch;

public class AggresiveCows {
    public static void main(String[] args) {
        int[] stalls={1,2,4,8,9};
        int cows=3;
        System.out.println(allocateCows(stalls, cows));
    }    
    // You are given the task of assigning stalls to k cows such that the minimum distance between any two of them is the maximum possible.
    public static int allocateCows(int[] stalls,int cows){
        int n=stalls.length;
        int low=1;
        int high=stalls[n-1]-stalls[0];
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(stalls, mid, cows)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] stalls,int mid,int cows){
        int initialcows=1;
        int lastplaced=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastplaced>=mid){
                initialcows++;
                lastplaced=stalls[i];
            }
        }
        if(initialcows>=cows){
            return true;
        }
        return false;
    }
}
