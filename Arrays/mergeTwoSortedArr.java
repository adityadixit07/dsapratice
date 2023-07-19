package Arrays;


public class mergeTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1={1,2,8,9};
        int[] arr2={2,3,5,6};
        sortedArrays(arr1, arr2);
    }
    public static void sortedArrays(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] arr3=new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++){
            arr3[k]=arr1[i];
            k++;
        }
        for(int j=0;j<n2;j++){
            arr3[k]=arr2[j];
            k++;
        }
        // printing arr3 array
        // for(int i=0;i<arr3.length;i++){
        //     System.out.print(arr3[i]+" ");
        // }

        for(int i=0;i<arr3.length;i++){
            if(arr1[i]>arr3[i]){
                // swap
                int temp=arr3[i];
                arr3[i]=arr1[i];
                arr1[i]=temp;
            }
        }
        for(int i=0;i<arr3.length;i++){
            if(arr2[i]>arr3[i]){
                // swap
                int temp=arr3[i];
                arr3[i]=arr2[i];
                arr2[i]=temp;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
