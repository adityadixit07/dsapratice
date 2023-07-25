// package hashmap;

import java.util.HashMap;

public class printCommonElements {
    public static void main(String[] args) {
        int[] arr1={1,2,2,4,3,3};
        int[] arr2={1,2,2,4,5,2};
        // we have to print those element of array 2 which are present in array1
        // output is : 1,2,4,5
        System.out.println("Comman elements:");
        printCommon(arr1, arr2);
    }
    
    public static void printCommon(int[] arr1,int[] arr2){
        //  algo first construct the freqmap for arr1 and then match the element with arr2
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                int old_freq=map.get(arr1[i]);
                int new_freq=old_freq+1;
                map.put(arr1[i],new_freq);
            }
            else{
                map.put(arr1[i],1);
            }
        }
        for(int a:arr2){
            if(map.containsKey(a)){
                System.out.print(a+",");
                map.remove(a);
            }
        }

    }

}
