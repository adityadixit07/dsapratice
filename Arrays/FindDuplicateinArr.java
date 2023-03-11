package Arrays;
import java.util.Arrays;
public class FindDuplicateinArr {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 6, 3, 8, 9, 7, 1,1 };
        findDuplicate(arr);
    }
    

    // time complexity:o(n*n)(for traversing array)+o(n)(for filling array) TC=O(n*n)
    // space complexity : O(n)
    public static void findDuplicate(int[] arr) {
        int[] freq=new int[arr.length];
        Arrays.fill(freq,0);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<freq.length;j++){
                if(arr[i]==j+1){
                    freq[j]++;
                }
            }
        }
        System.out.println("dupplicates element are:");
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                System.out.print((i+1)+" ");
            }
            
        }
    }
}
