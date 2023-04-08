package recursion;

public class DisplayArr {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        printEle(arr, 5, 0);
        System.out.println("\nmax in array:" + findMax(arr, arr.length, 0));
    }

    public static void printEle(int[] arr, int n, int i) {
        if (n == i) {
            return;
        }
        System.out.print(arr[i] + " ");
        printEle(arr, n, i + 1);
    }

    // print the max in array
    public static int findMax(int[] arr, int n, int index) {
        if (index == n) {
            return 0;
        }
        int res = Math.max(findMax(arr, n, index + 1), arr[index]);
        return res;
    }
}
