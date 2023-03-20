package dailycodingproblem;

import java.util.HashSet;
import java.util.Set;

/**
 * Good morning! Here's your coding interview problem for today.
 * <p>
 * This problem was recently asked by Google.
 * <p>
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * <p>
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * <p>
 * Bonus: Can you do this in one pass?
 */

public class day1 {
    public static void main(String[] args) {

        int[] arr = {10, 15, 3, 7};
        System.out.println(check(arr, 17));
    }


    public static boolean check(int[] arr, int k) {
        if (arr == null || arr.length < 2)
            return false;

        Set<Integer> temp = new HashSet<>();

        for (int value : arr) {
            if (temp.contains(value))
                return true;
            temp.add(k - value);

        }
        return false;
    }
}