package Arrays;

public class waveFormArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        // sort in this way {1,3,2,4} or {2,1,4,3} or any other way form way like structure
        waveform(arr);

    }
    public static void waveform(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i+=2){
            if(i>0 && arr[n-i]>arr[i]){
                // swap the arr[i] and arr[i-1]
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            // swaping between arr[i] and arr[i+1]
            if(i<n-1 && arr[i]<arr[n+i]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
// printing the array elements
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
