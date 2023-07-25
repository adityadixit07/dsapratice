package TwoPointer;


public class FindPairs {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 4, 6 };
        int target_sum = 6;
        findPairs(arr, target_sum);
    }

    public static void findPairs(int[] arr, int target_sum) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target_sum) {
                System.out.println("Pairs are "+arr[i]+" and "+arr[j]);
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>target_sum){
                j--;
            }
            else if(arr[i]+arr[j]<target_sum){
                i++;
            }
        }
    }
}
