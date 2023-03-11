package Arrays;
// equilibrium index of an array is such that the 
// SUM of elements at lower indexes is equal to the sum of elements at higher indexes
public class equilibriumIndex {
    public static void main(String[] args) {
        int[] arr={-7,1,5,2,-4,3,0};
        System.out.println(equilibriumIDX(arr));
    }
    public static int equilibriumIDX(int[] arr){
        int left_sum=0;
        int total_sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            total_sum+=arr[i];
        }
        int right_sum=0;
        for(int i=0;i<n;i++){
            right_sum=total_sum-left_sum-arr[i];
            if(left_sum==right_sum){
                return i;
            }
            left_sum+=arr[i];
        }
        return -1;
    }
}
