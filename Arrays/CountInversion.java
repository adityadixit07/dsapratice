package Arrays;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr={8,5,3,4,1,6,2};
        merge(arr, 0, arr.length-1);
        System.out.println(count);
    }
    
    static int count=0;
    public static int[] mergeTwoSortedArrays(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] merged=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                merged[k]=left[i];
                k++;
                i++;
            }
            else{
                merged[k]=right[j];
                k++;
                j++;
                count+=(left.length-i);
            }
        }
        while(i<left.length){
            merged[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            merged[k]=right[j];
            k++;
            j++;
        }
        return merged;
    }
    public static int[] merge(int[] arr,int low,int high){
        if(low==high){
            return new int[]{arr[low]};
        }
        int mid=(low+high)/2;
        int[] left=merge(arr,low,mid);
        int[] right=merge(arr, mid+1, high);
        int[] mergedArr=mergeTwoSortedArrays(left,right);
        return mergedArr;
    }
}
