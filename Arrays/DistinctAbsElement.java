package Arrays;

public class DistinctAbsElement {
    public static void main(String[] args) {
        int[] arr={-3,-3,-3,-2,1,0,2,2,3,3,4,5,5};
        // -3 and 3 count as 1 because abs values are taken
        System.out.println(distinctCount(arr));
    }
    public static int distinctCount(int[] arr){
        int prev=Integer.MIN_VALUE;
        int next=Integer.MAX_VALUE;
        int i=0;
        int j=arr.length-1;
        int count=0;
        while(i<j){
            int a=Math.abs(arr[i]);
            int b=Math.abs(arr[j]);
            if(arr[j]!=next){
                count++;
                j--;
                next=arr[j];
            }
            else if(a==b && prev!=next){
                count++;
                i++;
                j--;
            }
            else if(arr[i]!=prev){
                count++;
                i++;
            }
            else if(a==b && prev==next){
                i++;
                j--;
            }
        }
        return count;
    }
}
