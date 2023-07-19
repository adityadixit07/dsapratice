package Arrays;

public class sort012 {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 1, 2, 2, 1, 2, 0 };
        sort(arr);
    }
// dutch national algorithm (optimal algorithm) T.C=O(n) S.C=O(1)
    public static void sort(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // brute force approach
    // public static void segregate(int[] arr) {
    //     int count0 = 0;
    //     int count1 = 0;
    //     int count2 = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == 0) {
    //             count0++;
    //         }
    //         if (arr[i] == 1) {
    //             count1++;
    //         }
    //         if (arr[i] == 2) {
    //             count2++;
    //         }
    //     }
    //     int[] temp = new int[arr.length];
    //     int index = 0;
    //     for (int i = 0; i < count0; i++) {
    //         temp[index++] = 0;
    //     }
    //     for (int i = 0; i < count1; i++) {
    //         temp[index++] = 1;
    //     }
    //     for (int i = 0; i < count2; i++) {
    //         temp[index++] = 2;
    //     }
    //     for (int i = 0; i < temp.length; i++) {
    //         System.out.print(temp[i] + " ");
    //     }
    //     // System.out.println(count0 + " " + count1 + " " + count2);
    // }
}