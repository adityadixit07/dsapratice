package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,6,5,23,11,20};
        System.out.println("second largest element:"+findSecondLargest(arr));
    
    }

    public static int findSecondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondlarget=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlarget=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlarget && arr[i]!=largest){
                secondlarget=arr[i];
            }
        }
        return secondlarget;
    }
}
// algo 
// take two variable largest and second largest intilize with integer.minvalue
// check if current element greater then largest then update SecondLargest to largest
// and largest to current element
// else if SecondLargest greater than current element update it with current element
// now we get the  asnwer in SecondLargest
