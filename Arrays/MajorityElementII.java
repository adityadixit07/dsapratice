package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr={1,1,3,4,2,4,4,4,1,1};
        System.out.println(findMajorityEle(arr));
    }
    // Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
    public static List<Integer> findMajorityEle(int[] arr){
        // Boyer's voting algorithm I used here
        int num1=-1;
        int num2=-1;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num1){
                count1++;
            }
            else if(arr[i]==num2){
                count2++;
            }
            else if(count1==0){
                num1=arr[i];
                count1=0;
            }
            else if(count2==0) {
                num2=arr[i];
                count2=0;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> res=new ArrayList<>();
        int num1count=0;
        int num2count=0;
        for(int i=0;i<arr.length;i++){
            if(num1==arr[i]){
                num1count++;
            }
            else if(num2==arr[i]){
                num2count++;
            }
        }
        if(num1count>arr.length/3){
            res.add(num1);
        }
        if(num2count>arr.length/3){
            res.add(num2);
        }
        return res;
    }
}
