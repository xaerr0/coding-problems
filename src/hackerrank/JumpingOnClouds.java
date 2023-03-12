package hackerrank;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and
 others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the
 current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will take
  to jump from the starting postion to the last cloud. It is always possible to win the game.

 For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.

 Example
 c = [0, 1, 0, 0, 0, 1, 0]

 Index the array from . The number on each cloud is its index in the list so the player must avoid the clouds at
 indices  and . They could follow these two paths: 0 -> 2 -> 4 -> 6
 or 0 -> 2 -> 3 -> 4 -> 6 . The first path takes 3 jumps while the second takes 4. Return 3.

 Function Description

 Complete the jumpingOnClouds function in the editor below.

 jumpingOnClouds has the following parameter(s):

 int c[n]: an array of binary integers
 Returns
 int: the minimum number of jumps required


 Input Format
 The first line contains an integer , the total number of clouds. The second line contains  space-separated binary
 integers describing clouds  where .

 Constraints

 Output Format
 Print the minimum number of jumps needed to win the game.

 Sample Input 0

 7
 0 0 1 0 0 1 0
 Sample Output 0

 4

 */

public class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        //avoid c[1]
        //can jump current + 1 | 2
        int count = -1;

        for (int i = 0; i < c.size(); i++, count++) {
            if (i + 2 < c.size() && c.get(i + 2) == 0) {
                i++;
            }
        }
        return count;

    }
}