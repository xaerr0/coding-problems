package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 **/

public class _1_TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 4, 7, 12, 10};
        System.out.println("test");
        System.out.println(Arrays.toString(twoSum(nums, 22)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int i;
        int j;

        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("fail!");
    }

    public static int[] twoSumUsingHashMap(int[] nums, int target) {

        Map<Integer, Integer> compNum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer compIndex = compNum.get(nums[i]);
            if (compIndex != null) {
                return new int[] {i, compIndex};
            }
            compNum.put(target - nums[i], i);
        }
        return nums;
    }
}