package recursion;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        // revArr(arr, 0, arr.length-1);
        rev(arr, 0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    // reverse the array
    public static void revArr(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        revArr(arr, start+1, end-1);
    }

    // task is to do it with using only single pointer
    public static void rev(int[] arr,int start){
        if(start>=arr.length/2){
            return ;
        }
        int temp=arr[start];
        arr[start]=arr[arr.length-start-1];
        arr[arr.length-start-1]=temp;
        rev(arr, start+1);
    }
}
