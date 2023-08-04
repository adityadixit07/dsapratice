package dponString;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "abcsjkl";
        String s2 = "csjk";
        // output =3 "csjk"
        System.out.println("Length of longest common substring is:" + longestLength(s1, s2));
    }

    // problem is very much similar to LCS we just need a simple modification
    public static int longestLength(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        // base case
        for (int j = 0; j <= n2; j++) {
            dp[0][j] = 0;
        }
        for (int i = 0; i <= n1; i++) {
            dp[i][0] = 0;
        }
        int ans = 0;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        String res = "";
        int i = s1.length();
        int j = s2.length();
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                res= s1.charAt(i)+res;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        System.out.println("Longest common substring:"+res);
        return ans;
    }

}
