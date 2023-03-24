package hackerrank;

import java.util.List;

/**
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each
 * year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 *
 * Example
 * candles = [4, 4, 1, 3]
 *
 * The maximum height candles are 4 units high. There are 2 of them, so return 2.
 *
 * Function Description
 *
 * Complete the function birthdayCakeCandles in the editor below.
 *
 * birthdayCakeCandles has the following parameter(s):
 *
 * int candles[n]: the candle heights
 * Returns
 *
 * int: the number of candles that are tallest
 * Input Format
 *
 * The first line contains a single integer, n, the size of candles[].
 * The second line contains  space-separated integers, where each integer i describes the height of candles[i].
 *
 * Constraints
 *
 * Sample Input 0
 *
 * 4
 * 3 2 1 3
 * Sample Output 0
 *
 * 2
 * Explanation 0
 *
 * Candle heights are . The tallest candles are  units, and there are  of them.
 */

public class BirthdayCakeCandles {

    public static void main(String[] args) {

    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int largestCandle = Integer.MIN_VALUE;

        for (Integer candle : candles) {
            if (candle >= largestCandle)
                largestCandle = candle;
        }

        int result = 0;
        for (Integer candle : candles) {
            if (candle == largestCandle)
                result++;
        }
        return result;
    }

    public static int birthdayCakeCandles2(int[] arr) {
        int max = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i ++) {
            if (max == arr[i]) {
                count++;
            }
        }
        return count;
    }
}