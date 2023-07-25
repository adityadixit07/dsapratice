package TwoPointer;


public class FindMissing {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,5}; //here 3 is missing as arrray contains 0 to n element
        System.out.println("missing num:"+missingNum(arr));
    }
    public static int missingNum(int[] arr){
        int index=0;
        while(index<arr.length){
            int num=arr[index];
            if(num<arr.length && num!=index){
                int temp=arr[num];
                arr[num]=arr[index];
                arr[index]=temp;
            }
            else{
                index++;
            }
        }
        // now check for element
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return -1;
    }
}
