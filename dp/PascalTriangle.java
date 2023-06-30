import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println(nthRowofPascalTriangle(n));
    }    
    // we have to find the nth row of the pascal trianle
    public static ArrayList<Long> nthRowofPascalTriangle(int n){
        ArrayList<ArrayList<Long>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Long> al=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                    al.add((long)1);
                }
                else{
                    al.add((ans.get(i-1).get(j-1)+ans.get(i-1).get(j))%1000000007);
                }
            }
            ans.add(al);
        }
        return ans.get(n-1);
    }
}