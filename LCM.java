import java.util.*;

public class LCM {
    // NOTE: LCM*GCD = ProductOfNumbers

    private static long lcm_naive(int a, int b) {
        //Checks All Variations Extremely Slow Dont Use
        for (long l = 1; l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;
        return (long) a * b;
    }

    private static long gcd_fast(long a, long b) {
        //Recursive Approach
        //We want a>b therefore if b>a we interchange
        if (b > a) {
            long temp = a;
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
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long gcd = gcd_fast(a,b);
        long lcm = (a*b)/gcd;
        System.out.println(lcm);
    }
}
