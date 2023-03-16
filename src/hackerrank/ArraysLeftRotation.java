package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if
 left rotations are performed on array , then the array would become . Note that the lowest index item moves to
 the highest index in a rotation. This is called a circular array.

 Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be
 printed as a single line of space-separated integers.

 Function Description

 Complete the function rotLeft in the editor below.

 rotLeft has the following parameter(s):

 int a[n]: the array to rotate
 int d: the number of rotations
 Returns

 int a'[n]: the rotated array
 Input Format

 The first line contains two space-separated integers  and , the size of  and the number of left rotations.
 The second line contains  space-separated integers, each an .

 Constraints

 Sample Input

 5 4
 1 2 3 4 5
 Sample Output

 5 1 2 3 4
 */

public class ArraysLeftRotation {
    public static void main(String[] args) {
        rotLeft(List.of(1, 2, 3, 4, 5), 4);
    }

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
//    public static List<Integer> rotLeft(){
        // Write your code here

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new
                ArrayList<>();

        int k = 0;
        for (int i = d; i < a.size(); i++) {
            k = a.get(i);
            list1.add(k);
        }
        System.out.println("list1: " + list1.toString());

        for (int i = 0; i < d; i++) {
            k = a.get(i);
            list2.add(k);
        }

        System.out.println("list2: " + list2.toString());

        list1.addAll(list2);

        return list1;


    }
}