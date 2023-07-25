package recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n = 19896;
        System.out.println(isPalindrome(n));
        System.out.println(isPalindromeString("MADAM", 0));
    }

    public static boolean isPalindrome(int n) {
        int s = sum(n);
        int reversedNum = ReverseNum(s);
        if (reversedNum == s) {
            return true;
        }
        return false;
    }

    public static int ReverseNum(int n) {
        if (n < 10) {
            return n;
        }
        int lastdigit = n % 10;
        int remainingnum = n / 10;
        int reversed = ReverseNum(remainingnum);
        return (lastdigit * (int) Math.pow(10, (int) Math.log10(reversed) + 1)) + reversed;

    }

    public static int sum(int N) {
        int sum = 0;
        while (N > 0) {
            int rem = N % 10;
            sum += rem;
            N = N / 10;
        }
        return sum;
    }

    // palindrome string ex. MADAM
    public static boolean isPalindromeString(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }
        int n = s.length();
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
       return  isPalindromeString(s, i + 1);


    }

}
