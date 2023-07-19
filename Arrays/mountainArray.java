package Arrays;
// mountain array
// an array that is first strictly incresing then strictly decreasing
public class mountainArray {
    public static void main(String[] args) {
        int[] arr={0,2,3,3,5,2,1,0};
        System.out.println(validMountainArr(arr));
    }
    public static boolean validMountainArr(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<n-1 && arr[left]>arr[left+1]){
            left++;
        }
        while(right>0 && arr[right-1]>arr[right]){
            right--;
        }
        if(left>0 && left==right && right<n-1){
            return true;
        }
        else{
            return false;
        }
    }
}

// time complexity =O(n)