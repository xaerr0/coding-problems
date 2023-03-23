package hackerrank;

/**
 * Staircase detail
 *
 * This is a staircase of size :
 *
 * #
 * ##
 * ###
 * ####
 * Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 *
 * Write a program that prints a staircase of size .
 *
 * Function Description
 *
 * Complete the staircase function in the editor below.
 *
 * staircase has the following parameter(s):
 *
 * int n: an integer
 * Print
 *
 * Print a staircase as described above.
 *
 * Input Format
 *
 * A single integer, , denoting the size of the staircase.
 *
 * Constraints
 *
 * .
 *
 * Output Format
 *
 * Print a staircase of size  using # symbols and spaces.
 *
 * Note: The last line must have  spaces in it.
 *
 * Sample Input
 *
 * 6
 * Sample Output
 *
 * #
 * ##
 * ###
 * ####
 * #####
 * ######
 * Explanation
 *
 * The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .
 */

public class Staircase {

    public static void main(String[] args) {

//        staircase(9);
        staircase2(6);
    }


    public static void staircase(int n) {
        // Write your code here

        String str = "#";
        String space = " ";

        for (int i = 1; i < n; i++) {
            System.out.println(space.repeat(n - 1 - i) + str.repeat(n - (n - i)));
        }
    }


    public static void staircase2(int n) {

        for (int numSign = 1; numSign <= n; numSign++) {
            int numSpace = n - numSign;

            // print spaces
            for (int i = 0; i < numSpace; i++) {
                System.out.print(' ');
            }
            // print #
            for (int i = 0; i < numSign; i++) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}