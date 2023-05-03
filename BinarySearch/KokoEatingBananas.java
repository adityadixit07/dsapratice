package BinarySearch;


public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles={30,11,23,4,20};
        int h=5;
        System.out.println(minEatingSpeed(piles,h));
    } 
    public static int minEatingSpeed(int[]piles,int h){
        // findingmax in piles array
        int low=0;
        int high=Integer.MIN_VALUE;
        for(int val:piles){
            high=Math.max(high,val);
        }
        if(piles.length==h){
            return high;
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(piles,piles.length,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] piles,int n,int h,int speed){
        int time=0;
        for(int i=0;i<n;i++){
            time+=(piles[i]/speed);
        }
        if(time<h){
            return true;
        }
        return false;
    }  

}