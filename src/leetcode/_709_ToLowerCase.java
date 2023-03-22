package leetcode;

/**
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Hello"
 * Output: "hello"
 * Example 2:
 *
 * Input: s = "here"
 * Output: "here"
 * Example 3:
 *
 * Input: s = "LOVELY"
 * Output: "lovely"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 100
 * s consists of printable ASCII characters.
 */

public class _709_ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase2("HoW AwEsOmE"));
    }

    public String toLowerCase(String s) {
        String str;
        return str = s.toLowerCase();

    }

    // without library methods
    public static String toLowerCase2(String s) {

        s = "HoW AwEsOmE";
        //
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] += 'a' - 'A';
            }
        }
        return String.valueOf(arr);
    }


    public static String toUpperCase(String s) {

        s = "HoW AwEsOmE";
        //
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] += 'A' - 'a';
            }
        }
        return String.valueOf(arr);
    }
}