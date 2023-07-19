package Arrays;

public class removeDuplicates {
    
    public static void main(String[] args) {
        int[] arr={1,2,2,2,4,4,4,4,5};
        // output will be [1,2,3,4,5]
        System.out.println(uniqueElementCount(arr));
        System.out.println("After removing duplicates from the array:");
        for(int i=0;i<=count;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int count=0;
    public static int uniqueElementCount(int[] arr){
        int n=arr.length;
        int i=0;
        int j=1;
        while(i<n && j<n){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
                count++;
            }
            j++;
        }
        return count+1;
    }
}

// APPROACHES 
// brute force using extra memory space
// two pointer approach
// counting duplicates
