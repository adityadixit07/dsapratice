import java.util.Scanner;

class BubbleSort {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // user input logic
        
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

        
        
        // Bubble sort logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("The sorted Array:\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}