public class RightMostSetBitMask {
    public static void main(String[] args) {
        int n = 14;
        int ans = n & -n;
        System.out.println(ans);
        // or
        // (number)&(two's complement of number)
        int onescomplement = -n;
        int twoscomplement = onescomplement + 1;
        int output = n & twoscomplement;
        System.out.println(output);
        // or simply we can write
        System.out.println(n & (-n + 1));

    }
}
