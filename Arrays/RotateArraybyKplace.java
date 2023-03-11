package Arrays;

public class RotateArraybyKplace {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateArray(arr, k);
    }

    // given that array is sorted we have to do k right rotation in array
    public static void rotateArray(int[] arr, int k) {
        k=k%arr.length; //it is necessary to handle case where array length <k
        // example [1,2] k=3 output [2,1] if we no do k=k%n then we get [1,2]
        rotate(arr, 0, arr.length - 1);
        // upto this we get array 7,6,5,4,3,2,1
        rotate(arr, 0, k - 1);
        rotate(arr, k, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
