package BinarySearch;

public class MedianofTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1 = { 4, 6};
        int[] arr2 = { 1, 2, 3, 5 };
        System.out.println(findMedian(arr1, arr2));
    }

    public static double findMedian(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(n1>n2){
            int[] temp=arr1;
            arr1=arr2;
            arr2=temp;
        }
        int total=n1+n2;
        int low=0;
        int high=n1;
        while(low<=high) {
            int  aleft=(high+low)/2;
            int  bleft=(total+1)/2-aleft;
            
            int alm1=(aleft==0)?Integer.MIN_VALUE:arr1[aleft-1];
            int al=(aleft==n1)?Integer.MAX_VALUE:arr1[aleft];
            int bl=(bleft==0)?Integer.MIN_VALUE:arr2[bleft-1];
            int blm1=(bleft==n2)?Integer.MAX_VALUE:arr2[bleft];
            // valid segregation
            if(alm1<=bl && blm1<=al){
                double median=0.0;
                if(total%2==0){
                    int leftmax=Math.max(alm1,blm1);
                    int rightmin=Math.min(al,bl);
                    median=(leftmax+rightmin)/2.0;
                }
                else{
                    int leftmax=Math.max(alm1,blm1);
                    median=leftmax;
                }
                return median;
            }
           else if(alm1>bl){
                // more element placed in left part of array 2
                high=aleft-1;
            }
            else if(blm1>al){
                // more element placed in left part of array1
                low=aleft+1;
            }
        }
        return 0;
    }
}
