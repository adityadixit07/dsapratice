package recursion;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println("Reversed string:");
        reverseStr(s, 0);
        for (int i = 0; i < s.length; i++) {
            System.out.print((char) s[i] + " ");
        }

        // char[] ch = { 'a', 'b', 'c' };
        // char temp=ch[0];
        // ch[0]=ch[2];
        // ch[2]=temp;
        // System.out.println();
        // for (int i = 0; i < ch.length; i++) {
        // System.out.println((char)ch[i]);
        // }
    }

    // task
    // Input: s = ['h','e','l','l','o']
    // Output: ['o','l','l','e','h']
    public static void reverseStr(char[] s, int i) {
        if (i >= s.length / 2) {
            return;
        }
        int n = s.length;
        char temp = s[i];
        s[i] = s[n - i - 1];
        s[n - i - 1] = temp;
        reverseStr(s, i + 1);
    }
}
