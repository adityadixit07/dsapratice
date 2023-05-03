package BinarySearch;

public class CakeDistributationProblem {
    public static void main(String[] args) {
        int[] sweetness={6,3,2,8,7,5};
        int k=2;
        System.out.println(maxSweetness(sweetness, k));
    }
    public static int maxSweetness(int[] sweetness,int k){
        int totalsum=0;
        int min=Integer.MAX_VALUE;
        for(int val:sweetness){
            totalsum+=val;
            min=Math.min(min,val);
        }
        int low=min;
        int high=totalsum;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(sweetness,k,mid)){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public static boolean isValid(int[] sweetness,int k,int mid){
        int count=1;
        int sum=0;
        for(int i=0;i<sweetness.length;i++){
            sum+=sweetness[i];
            if(sum>=mid){
                count++;
                sum=0;
            }
        }
        if(count>k+1){
            return true;
        }
        return false;
    }
}
// The cake consists of N chunks, whose individual sweetness is represented by the sweetness array. Now at the time of distribution, Geek cuts the cake into K + 1 pieces to distribute among his K friends. One piece he took for himself. Each piece consists of some consecutive chunks. He is very kind, so he left the piece with minimum sweetness for him.

// You need to find the maximum sweetness that the Geek can get if he distributes the cake optimally.
