import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxofAllSubarrSize {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        // System.out.println(sol(arr, k));
        // System.out.println(solUsingPq(arr, k));
    }
    //sliding window approach using deque data structure
    

    // brute force appproach-> time complexity:O(n*k) space-complexity:O(1)
    // public static ArrayList<Integer> sol(int[] arr, int k) {
    //     ArrayList<Integer> res = new ArrayList<>();
    //     int max = Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length - k + 1; i++) {
    //         max = arr[i];
    //         for (int j = i; j < k + i; j++) {
    //             max = Math.max(max, arr[j]);
    //         }
    //         res.add(max);
    //     }
    //     return res;
    // }

    // using priorityqueue maxheap -> time complexity :O(nlogk) Space-complexity:O(n)
    // public static ArrayList<Integer> solUsingPq(int[] arr,int k){
    //     PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder(null));
    //     ArrayList<Integer> res=new ArrayList<>();
    //     for(int i=0;i<k;i++){
    //         pq.add(arr[i]);
    //     }
    //     res.add(pq.peek());
    //     pq.remove(arr[0]);
    //     for(int i=k;i<arr.length;i++){
    //         pq.add(arr[i]);
    //         res.add(pq.peek());
    //         pq.remove(arr[i-k+1]);
    //     }
    //     return res;
    // }
}

// problem
// {1,3,-1,-3,5,3,6,7}
// max(1,3,1)=3
// max(3,-1,-3)=3
// max(-1,-3,5)=5 and so on