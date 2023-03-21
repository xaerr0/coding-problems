package leetcode;

import java.util.Arrays;

/**
 Write a function to find the longest common prefix string amongst an array of strings.

 If there is no common prefix, return an empty string "".



 Example 1:

 Input: strs = ["flower","flow","flight"]
 Output: "fl"
 Example 2:

 Input: strs = ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.


 Constraints:

 1 <= strs.length <= 200
 0 <= strs[i].length <= 200
 strs[i] consists of only lowercase English letters.
 */

public class _14_LongestCommonPrefix {

    public static void main(String[] args) {
        longestCommonPrefix(new String[] {"super", "sudoku", "suppanova", "sutra"});
    }

    public static String longestCommonPrefix(String[] strs) {

        System.out.println(Arrays.asList(strs));
        //Output: "fl"

        //start first word as prefix
        //compare "super" with "sudoko"
        //"sudoko" is not in "super", return and -1 in length
        //"sudok" is not in "super", return and -1 in length
        //"sudo" is not in "super", return and -1 in length
        // etc etc
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++ ) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
        return prefix;
        }

}