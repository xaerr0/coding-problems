package hackerrank;

import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .
 *
 * Example
 *
 *
 *
 * Three pairs meet the criteria:  and .
 *
 * Function Description
 *
 * Complete the divisibleSumPairs function in the editor below.
 *
 * divisibleSumPairs has the following parameter(s):
 *
 * int n: the length of array
 * int ar[n]: an array of integers
 * int k: the integer divisor
 * Returns
 * - int: the number of pairs
 *
 * Input Format
 *
 * The first line contains  space-separated integers,  and .
 * The second line contains  space-separated integers, each a value of .
 *
 * Constraints
 *
 * Sample Input
 *
 * STDIN           Function
 * -----           --------
 * 6 3             n = 6, k = 3
 * 1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
 * Sample Output
 *
 *  5
 */

public class DivisibleSumPairs {

    public static void main(String[] args) {

        divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    count++;

                }
            }
        }
        System.out.println(count);
        return count;
    }
}