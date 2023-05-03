package TwoPointer;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2,}; //array contains 1 to n elements
        System.out.println("duplicate element:"+duplicateEle(arr));
        int a=7;
        int b=3;
        System.out.println(a/b);
    }
    // I am using fast and slow pointer approach to solve this problem

    public static int duplicateEle(int[] arr){
        int slow=arr[0];
        int fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);

        fast=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }

}
