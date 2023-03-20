package leetcode;

import java.util.Stack;

/**
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Every close bracket has a corresponding open bracket of the same type.

 Example 1:

 Input: s = "()"
 Output: true
 Example 2:

 Input: s = "()[]{}"
 Output: true
 Example 3:

 Input: s = "(]"
 Output: false


 Constraints:

 1 <= s.length <= 104
 s consists of parentheses only '()[]{}'.
 */

public class _20_ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char firstChar = s.charAt(0);

        if (s.length() == 1 || firstChar == ')' || firstChar == ']' || firstChar == '}'){
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            if (c == ')' && stack.isEmpty() || c == ')' && stack.pop() != '(') {
                return false;
            } if (c == ']' && stack.isEmpty() || c == ']' && stack.pop() != '[') {
                return false;
            } if (c == '}' && stack.isEmpty() || c == '}' && stack.pop() != '{') {
                return false;
            }

        }
        return stack.isEmpty();
    }
}