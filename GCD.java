import java.util.*;

public class GCD {

    private static int gcd_naive(int a, int b) {
        //This checks all numbers from 1 to a+b
        int current_gcd = 1;
        for (int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }

    private static int gcd_fast(int a, int b) {
        //Recursive Approach
        //We want a>b therefore if b>a we interchange
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        }
        return gcd_fast(b, a % b); //Recursion

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd_fast(a, b));
    }
}
