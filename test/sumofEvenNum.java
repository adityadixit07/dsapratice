import java.util.Scanner;

// 2. Write a function to compute the the sum of n even numbers
public class sumofEvenNum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("enter the number:");
        int input = sc.nextInt();
        System.out.println("sum of n even numbers:" + sumNEvenNum(input));
    }

    public static int sumNEvenNum(int n) {
        int sum = 0;
        while (n >= 0) {
            if (n % 2 == 0) {
                sum += n;
            }
            n--;
        }
        return sum;
    }
}