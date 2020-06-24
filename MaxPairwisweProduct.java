import java.util.Scanner;

public class MaxPairwisweProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(maxPairwiseProduct(arr));


    }

    public static long maxPairwiseProduct(long[] arr) {
        long largest = Integer.MIN_VALUE;
        int largestIndex = -1;
        //Largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                largestIndex = i;
            }
        }
        //Second Largest
        long secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= secondLargest && i != largestIndex) {
                secondLargest = arr[i];

            }
        }
        return largest * secondLargest;
    }

}