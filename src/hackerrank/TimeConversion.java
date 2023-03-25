package hackerrank;

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * Example
 *
 *
 * Return '12:01:00'.
 *
 *
 * Return '00:01:00'.
 *
 * Function Description
 *
 * Complete the timeConversion function in the editor below. It should return a new string representing the input
 * time in 24 hour format.
 *
 * timeConversion has the following parameter(s):
 *
 * string s: a time in 12 hour format
 * Returns
 *
 * string: the time in 24 hour format
 * Input Format
 *
 * A single string s that represents a time in 12-hour clock format (i.e.: hh:mm:ssAM  or hh:mm:ssPM ).
 *
 * Constraints
 *
 * All input times are valid
 * Sample Input 0
 *
 * 07:05:45PM
 * Sample Output 0
 *
 * 19:05:45
 */
public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("04:01:00PM"));
    }

    public static String timeConversion(String s) {
        String start = s.substring(0, 2);
        String end = s.substring(2, 8);
        int hour = Integer.parseInt(start);

        if (s.contains("P") && hour < 12) {
            hour += 12;
            start = String.valueOf(hour);

        } else if (s.contains("A") && hour == 12) {
            start = "00";
        }
        s = start + end;

        return s;
    }
}