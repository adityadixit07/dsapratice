package Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr={1,1,1,3,2,5,23,12,7,6};
        System.out.println("second smallest element:"+findSecondSmallest(arr));
    }
    public static int findSecondSmallest(int[]arr){
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondsmallest && arr[i]!=smallest){
                secondsmallest=arr[i];
            }
        }
        return secondsmallest;
    }
}

// algo
// intialize two variable smallest and secondsmallest with integer.MAX_VALUE
// if currentelement less than smallest then we upadate the second smallest with
// smallest and smallest to current element
// else if current element is smallest than secondsmallest we update the secondsmallest
// with current element
// we get our answer in form of secondsmallest variable
