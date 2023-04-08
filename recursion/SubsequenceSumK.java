package recursion;
import java.util.ArrayList;

public class SubsequenceSumK {
    static ArrayList<Integer>res=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = { 1, 2,1,2};
        ArrayList<Integer> al=new ArrayList<>();
        for(int val:arr){
            al.add(val);
        }
        int sum = 2;
        // print all subsequence whose sum is k
        // printAllSubsequnceSumK(0,al,sum,res,0);

        // printing only any one subsequence whose sum is k
        System.out.println(printAnySusbequnceSumK(arr,0,sum,0));

    }

    // Given an array arr[] of non-negative integers and an integer sum, the task is
    // to count all subsets of the given array with a sum equal to a given sum.
    // arr={1,2,1} sum=2
    // then total subsequences will be [1,1] and [2]
    public static void printAllSubsequnceSumK(int index,ArrayList<Integer> arr, int sum,ArrayList<Integer> res,int s) {
        if(index>=arr.size()-1){
            if(s==sum){
                // print result
                for(int i=0;i<res.size();i++){
                    System.out.print(res.get(i)+" ");
                }
                System.out.println();
            }
            return;
        }

        // take it in answer
        res.add(arr.get(index));
        s+=arr.get(index);
        printAllSubsequnceSumK(index+1, arr, sum, res, s);
        s-=arr.get(index);

        res.remove(arr.get(index));
        
        // not take in answer
        printAllSubsequnceSumK(index+1, arr, sum, res, s);
    }

    // print only one any subsequence whose sum is k
    public static int printAnySusbequnceSumK(int[] arr,int index,int givensum,int sum){
        if(index==arr.length-1){
            if(sum==givensum){
                return 1;
            }
            else{
                return 0;
            }
        }
        sum+=arr[index];
        int left=printAnySusbequnceSumK(arr, index+1, givensum,sum);
        sum-=arr[index];
        int right=printAnySusbequnceSumK(arr, index+1, givensum, sum);
        return left+right;
    }
}
