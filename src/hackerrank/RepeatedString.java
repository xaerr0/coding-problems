package hackerrank;

public class RepeatedString {
    public static void main(String[] args) {
        repeatedString("abcac", 10L);
    }

    public static long repeatedString(String s, long n) {


        long times = n / s.length();
        long remainder = n % s.length();
        long aCount = 0;

        for (char c : s.toString().toCharArray()) {
            if (c == 'a') {
                aCount++;
            }
        }
        aCount *= times;

        String subString = s.substring(0, (int) remainder);
        for (char c : subString.toString().toCharArray()) {
            if (c == 'a') {
                aCount++;
            }
        }
        System.out.println(aCount);
        return aCount;
    }
}