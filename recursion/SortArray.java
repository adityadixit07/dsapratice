package recursion;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={3,1,5,8,2,9,6};
        int[] op=sortArr(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(op[i]+" ");
        }
    }
    public static int[] sortArr(int[] arr,int n){
        if(n==1){
            return new int[]{arr[0]};
        }
        int a=arr[0];
        int[] res=sortArr(arr,n-1);
        return res;
    }
}