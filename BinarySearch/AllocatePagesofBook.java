package BinarySearch;

public class AllocatePagesofBook {
    public static void main(String[] args) {
        int[] arr={12,34,67,90}; //array is not sorted
        int students=2;
        System.out.println(findPages(arr, students));
    }
    // do it and learn the concept bcoz it is interview problem
    public static int findPages(int[] arr,int students){
        // if student greater than number of books return -1
        if(arr.length<students){
            return -1;
        }
        int start=maxarr(arr);
        int end=sumarr(arr);
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(arr,mid,students)){
                res=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
    // main logic
    public static boolean isValid(int[] arr,int maxpages,int totalstudents){
        int student=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxpages){
                student++;
                sum=arr[i];
            }
            if(student>totalstudents){
                return false;
            }
        }
        return true;
    }
    // max in array
    public static int maxarr(int[]arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            if(res<arr[i]){
                res=Math.max(res,arr[i]);
            }
        }
        return res;
    }
    // sum the array
    public static int sumarr(int[] arr){
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
