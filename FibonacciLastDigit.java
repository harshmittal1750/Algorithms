import java.util.*;

public class FibonacciLastDigit {
//If you write out a sequence of Fibonacci numbers, you can see that the last digits repeat every 60 numbers.
//The 61st Fibonacci number is 2504730781961. The 62nd is 4052739537881
//This algorithm can take really large numbers and calculate the last digit using the pattern stated above


    private static int[] Fib60TermsInArray() {
        //Storing last digit of 60 terms of series in array
        int[] fibLast = new int[60];
        fibLast[0] = 0;
        fibLast[1] = 1;
        for (int i = 2; i < fibLast.length; i++) {
            fibLast[i] = (fibLast[i - 1] + fibLast[i - 2]) % 10;
        }
        return fibLast;
    }

    private static int getFibonacciLastDigitUsingPattern(int n) {

        int[] fibLast = Fib60TermsInArray();
        if (n <= 60) {
            return fibLast[n];
        }
        int index = n % 60;
        return fibLast[index];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFibonacciLastDigitUsingPattern(n));
    }

}


