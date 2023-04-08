package recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr={1,3,4,4,4,5,6,7};
        int target=4;
        System.out.println("first occurence of "+target+" at "+findFirstOccur(arr, 0, target));
        System.out.println("last occurence of "+target+" at "+findLastOccur(arr, arr.length-1, target));
    }
    // we have to find the first occurence of given element in an array
    public static int findFirstOccur(int[] arr,int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findFirstOccur(arr, index+1, target);
        }
    }
    // we have given an element find the last occurence of that element in an array
    public static int findLastOccur(int[] arr,int index,int target){
        if(index<0){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findLastOccur(arr, index-1, target);
            
        }
        
        
    }
}
