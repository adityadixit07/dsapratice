package dponString;
public class lcs {
    public static void main(String[] args) {
        String s1 = "acd";
        String s2 = "ced";
        System.out.println(helper(s1.length() - 1, s2.length() - 1, s1, s2)); //recursive tc=(2^n * 2^m )
        System.out.println(longestLength(s1, s2)); //dp  TC=O(n*m) Sc=O(n+m);
        System.out.println(longestLength_optimised(s1, s2)); //space optimised SC=O(n)
    }

    // dp solution
    public static int longestLength(String s1, String s2){
        int n1=s1.length();
        int n2=s2.length();
        int[][] dp=new int[n1+1][n2+1];
        // base case
        for(int j=0;j<=n2;j++){
            dp[0][j]=0;
        }
        for(int i=0;i<=n1;i++){
            dp[i][0]=0;
        }

        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[n1][n2];
    }

    // we can easily space optimise the dp solution also

   public static int longestLength_optimised(String s1, String s2){
        int n1=s1.length();
        int n2=s2.length();
        int[]prev=new int[n2+1];
        // base case
        for(int j=0;j<=n2;j++){
            prev[j]=0;
        } 
int[] curr=new int[n2+1];
        for(int i=1;i<=n1;i++){
            
            for(int j=1;j<=n2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j]=1+prev[j-1];
                }
                else{
                    curr[j]=Math.max(prev[j], curr[j-1]);
                }
            }
            prev=curr;
        }

        return prev[n2];
    }

    // recursion
    public static int helper(int n1, int n2, String s1, String s2) {
        if (n1 < 0 || n2 < 0) {
            return 0;
        }
        // if character matches
        if (s1.charAt(n1) == s2.charAt(n2)) {
            return 1 + helper(n1 - 1, n2 - 1, s1, s2);
        }
        // if character does not match then we can reduce index by one either s1 or s2
        int s1reduces = helper(n1 - 1, n2, s1, s2);
        int s2reduces = helper(n1, n2 - 1, s1, s2);
        return 0 + Math.max(s1reduces, s2reduces);
    }
}
