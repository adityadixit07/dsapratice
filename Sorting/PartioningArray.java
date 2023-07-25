// package Sorting;

public class PartioningArray {
    public static void main(String[] args) {
        int[] arr={7,9,4,8,3,6,2,1};
        System.out.println(pivotElement(arr,0,arr.length-1));
    }
    // we have given an array we have to find the pivot element such that all elemment 
    // less that pivot are on left side and all element greater than pivot are on 
    // right side.

    public static int pivotElement(int[] arr,int low,int high){
       int pivot=arr[high];
       int i=low;
       int j=high;
       while(i<=high){
        if(arr[i]>pivot){
            i++;
        }
        else{
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j++;
        }
       }
       return j-1;
    }

}
