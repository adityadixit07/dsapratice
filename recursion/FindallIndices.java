package recursion;

public class FindallIndices {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,6,4,3,3,8,9};
        int x=3;
        int[] res=findIndices(arr, x, 0, 0);
        System.out.println("Element "+x+" occurs at these indices:");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        } 
    }
    // find all indices means we have given an array and an element we have to 
    // find all the occurence of that element and store it into an array
    public static int[] findIndices(int[] arr,int target,int index,int foundSoFar){
        if(index==arr.length){
            return new int[foundSoFar];
        }
        if(arr[index]==target){
            int[] res=findIndices(arr, target, index+1, foundSoFar+1);
            res[foundSoFar]=index;
            return res;
        }
        else{
            int[]res=findIndices(arr, target, index+1, foundSoFar);
            return res;
        }
    }
    
}
