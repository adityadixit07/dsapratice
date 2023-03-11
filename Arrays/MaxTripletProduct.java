package Arrays;

class MaxTripletProduct {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2 };
        System.out.println("Max triplet product:"+maxProduct(arr));
    }

    public static long maxProduct(int[] arr) {
        long m1 = Integer.MIN_VALUE;
        long m2 = Integer.MIN_VALUE;
        long m3 = Integer.MIN_VALUE;
        long min1 = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>m1){
                m3=m2;
                m2=m1;
                m1=arr[i];
            }
            else if(arr[i]>m2){
                m3=m2;
                m2=arr[i];
            }
            else if(arr[i]>m1){
                m1=arr[i];
            }
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2){
                min2=arr[i];
            }
        }
        long ans=(long)Math.max(min1*min2*m1,m1*m2*m3);
        return ans;
    }
}