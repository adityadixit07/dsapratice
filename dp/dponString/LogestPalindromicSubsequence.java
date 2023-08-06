package dponString;
public class LogestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "bbabcab";
        String revS = "";
        for (int i = 0; i < s.length(); i++) {
            revS = s.charAt(i) + revS;
        }
        System.out.println(longestLength(s, revS));
    }

    // first we rev the string and then take the LCS
    public static int longestLength(String s, String revS) {
        int n1 = s.length();
        int n2 = revS.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        // base case
        for (int j = 0; j <= n2; j++) {
            dp[0][j] = 0;
        }
        for (int i = 0; i <= n1; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s.charAt(i - 1) == revS.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        String ans = "";
        int i = s.length();
        int j = revS.length();
        while (i > 0 && j > 0) {
            if (s.charAt(i - 1) == revS.charAt(j-1)) {
                ans = s.charAt(i) + ans;
                i--;
                j--;
            } else if (s.charAt(i-1) >revS.charAt(j-1)) {
                i--;
            } else {
                j--;
            }
        }
        System.out.println(ans);

        return dp[n1][n2];
    }
}
