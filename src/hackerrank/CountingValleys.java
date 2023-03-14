package hackerrank;

public class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int elevation = 0; // 1 0 -1
        int prevElevation = 0; // 1 0 -1
        int valley = 0; // 1

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                elevation++;
            }
            if (path.charAt(i) == 'D') {
                elevation--;
            }
            if (elevation < 0 && prevElevation == 0) {
                valley++;
            }
            prevElevation = elevation;
        }
        return valley;

    }

}