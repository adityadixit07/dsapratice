package Arrays;

public class moveZerosToEnd {
    public static void main(String[] args) {
        int[] arr={0,2,0,9,1,0,0,2,4,8,6,0};
        sort(arr);
    }
    public static void sort(int[] arr){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
