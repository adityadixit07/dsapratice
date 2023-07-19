package Arrays;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class mergeIntervals {
    public static void main(String[] args) {
        int[][] arr={{1,3},{2,6},{8,10},{10,19},{15,18}};
        int[][] res=merge(arr);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
        }
    }
    // problem:https://leetcode.com/problems/merge-intervals/description/
    public static int[][] merge(int[][] arr){
        List<int[]> al=new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int start=arr[0][0];
        int end=arr[0][1];
        for(int[] val:arr){
            if(val[0]<=end){
                end=Math.max(end,val[1]);
            }
            else{
                al.add(new int[]{start,end});
                start=val[0];
                end=val[1];
            }
        }
        al.add(new int[]{start,end});
        return al.toArray(new int[0][]);
    }
}
// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].