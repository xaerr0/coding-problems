package hackerrank;

/**
 * Given the time in numerals we may convert it into words, as shown below:
 *
 * At , use o' clock. For , use past, and for  use to. Note the space between the apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described.
 *
 * Function Description
 *
 * Complete the timeInWords function in the editor below.
 *
 * timeInWords has the following parameter(s):
 *
 * int h: the hour of the day
 * int m: the minutes after the hour
 * Returns
 *
 * string: a time string as described
 * Input Format
 *
 * The first line contains , the hours portion The second line contains , the minutes portion
 *
 * Constraints
 *
 * Sample Input 0
 *
 * 5
 * 47
 * Sample Output 0
 *
 * thirteen minutes to six
 * Sample Input 1
 *
 * 3
 * 00
 * Sample Output 1
 *
 * three o' clock
 * Sample Input 2
 *
 * 7
 * 15
 * Sample Output 2
 *
 * quarter past seven
 */

public class TimeInWords {

    public static void main(String[] args) {

        System.out.println(timeInWords(4, 32));
    }


    public static String timeInWords(int h, int m) {
        // Write your code here
        String[] word = {"o' clock", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven",
                "twelve", "thirteen", "fourteen", "quarter",
                "sixteen", "seventeen", "eighteen", "nineteen",
                "twenty", "twenty one", "twenty two", "twenty three",
                "twenty four", "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine", "half"};

        if (m == 0) {
            return word[h] + " " + word[0];

        } else if (m == 15) {
            return word[m] + " past " + word[h];

        } else if (m == 1) {
            return word[m] + " minute past " + word[h];

        } else if (m < 30) {
            return word[m] + " minutes past " + word[h];

        } else if (m == 30) {
            return "half past " + word[h];

        } else if (m == 45) {
            return "quarter to " + word [h + 1];

        } else {
            return word[60 - m] + " minutes to " + word[h + 1];
        }
    }
}