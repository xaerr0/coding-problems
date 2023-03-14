package codewars;

import java.util.Arrays;

/**
 Given two positive integers m (width) and n (height), fill a two-dimensional list (or array) of size m-by-n in the following way:

 (1) All the elements in the first and last row and column are 1.

 (2) All the elements in the second and second-last row and column are 2, excluding the elements from step 1.

 (3) All the elements in the third and third-last row and column are 3, excluding the elements from the previous steps.

 And so on ...

 Examples
 Given m = 5, n = 8, your function should return

 [[1, 1, 1, 1, 1],
 [1, 2, 2, 2, 1],
 [1, 2, 3, 2, 1],
 [1, 2, 3, 2, 1],
 [1, 2, 3, 2, 1],
 [1, 2, 3, 2, 1],
 [1, 2, 2, 2, 1],
 [1, 1, 1, 1, 1]]
 Given m = 10, n = 9, your function should return

 [[1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
 [1, 2, 2, 2, 2, 2, 2, 2, 2, 1],
 [1, 2, 3, 3, 3, 3, 3, 3, 2, 1],
 [1, 2, 3, 4, 4, 4, 4, 3, 2, 1],
 [1, 2, 3, 4, 5, 5, 4, 3, 2, 1],
 [1, 2, 3, 4, 4, 4, 4, 3, 2, 1],
 [1, 2, 3, 3, 3, 3, 3, 3, 2, 1],
 [1, 2, 2, 2, 2, 2, 2, 2, 2, 1],
 [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]]
 */
public class TheSpiralingBox {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createBox(5, 8)));
    }
    public static int[][] createBox(int width, int length) {
        // Put your code here.
        int[][] box = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                box[i][j] = 1 + Math.min(Math.min(i, length - i - 1), Math.min(j, width - j - 1));
            }
        }
        System.out.println(box);
        return box;
    }
}