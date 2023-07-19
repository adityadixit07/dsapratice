package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3,3,3,32,2,2,3,3};
        System.out.println(findMajorityelement(arr));
        System.out.println(1^99);
    }
    //moore voting alorithm is applied here
    public static int findMajorityelement(int[] arr){
        int majele=0;
        int count=0;
        int i=0;
        while(i<arr.length){
            if(count==0){
                majele=arr[i];
            }
            if(majele==arr[i]){
                count++;
            }
            else{
                count--;
            }
            i++;
        }
        // now handle the case that if majele not present
        int newcount=0;
        for(int j=0;j<arr.length;j++){
            if(majele==arr[j]){
                newcount++;
            }
        }
        if(newcount>arr.length/2){
            return majele;
        }
        else{
            return -1;
        }
    }
}

// majority element are those element which occur more than [n/2] times in an array
// if not occured return -1;
// else return majeleemnt;