package BinarySearch;

import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;

public class KClosestElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int k=3; // we have to find the k closest element in array
        int x=45;
        System.out.println(kclosestcount(arr, x, k));
    }
    public static List<Integer> kclosestcount(int[] arr,int x,int k){
        List<Integer> al=new ArrayList<>();
        // using max priority queue
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        // collections.reverseOrder is doing for making max heap so that if we remove
        // element every time mmaximum element removed
        for(int i=0;i<arr.length;i++){
            if(pq.size()<k){
                pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            }
            else{
                if(pq.peek().gap>Math.abs(arr[i]-x)){
                    pq.remove();
                    pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
                }
            }
        }
        // now forming ans
        while(pq.size()>0){
            Pair rem=pq.remove();
            al.add(rem.val);
        }
        Collections.sort(al);
        return al;
    }
    // pair class that takes care of element and gap
    // gap=|x-arr[i]|
    public static class Pair implements Comparable<Pair>{
        int val;
        int gap;
        Pair(){

        }
        Pair(int val,int gap){
            this.val=val;
            this.gap=gap;
        }
        public int compareTo(Pair o){
            if(this.gap==o.gap){
                return this.val-o.val;
            }
            else{
                return this.gap-o.gap;
            }
        }
    }
} 