import java.util.Scanner;
public class InsertionSort {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //user input;

        
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        
        //insertion sort logic
        int sortedarray[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&& sortedarray[j]>key){
                sortedarray[j+1]=sortedarray[j];
                j=j-1;
            }
            sortedarray[j+1]=key;
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.println(sortedarray[i]+" ");
        }
    }
    
}
