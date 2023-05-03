
class MergeSort{
    public static void main(String[] args) {
        int[] arr={34,2,12,67,3,32};
        int[] res=merge_sort(arr, 0, arr.length-1);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] merge_sort(int[] arr,int low,int high){
        if(low==high){
            // base case
            int[] ba=new int[1];
            ba[0]=arr[low];
            return ba;

        }
        int mid=(low+high)/2;
        int[] first_half=merge_sort(arr, low,mid);
        int[] second_half=merge_sort(arr, mid+1 ,high);
        int[] full_arr=merge(first_half,second_half);
        return full_arr;
    }
    public static int[] merge(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;
        int[] res=new int[n+m];
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }
            else{
                res[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            res[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            res[k]=arr2[j];
            j++;
            k++;
        }
        return res;
    }

}