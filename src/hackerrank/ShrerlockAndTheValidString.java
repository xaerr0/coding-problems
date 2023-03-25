package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class ShrerlockAndTheValidString {
    public static void main(String[] args) {

        System.out.println(isValid("aabbccddeefghi"));
    }

    public static String isValid(String s) {

        HashMap<Character, Integer> letters = new HashMap<>();
        // mississippi //banana


        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            int tmp = 0;
            if (letters.containsKey(c)) {
                tmp = letters.get(c);
            }

            if (tmp >= 1) {
                letters.put(c, tmp + 1);
            } else {
                letters.put(c, 1);
            }
        }

        List<Integer> valueList = new ArrayList<>(letters.values());
        Collections.sort(valueList);

        if (valueList.size() == 1)
            return "YES";

        int first = valueList.get(0);
        int second = valueList.get(1);
        int secondLast = valueList.get(valueList.size() - 2);
        int last = valueList.get(valueList.size() - 1);

        // if first and last are the same, then all frequencies are the same
        if (first == last)
            return "YES";

        // if first is 1, and all other characters have 1 frequency
        if (first == 1 && second == last)
            return "YES";

        // if all are the same and last character has 1 extra count
        if (first == second && second == secondLast && secondLast == (last - 1)) {
            return "YES";
        }
        return "NO";
    }
}