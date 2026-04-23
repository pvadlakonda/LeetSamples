package com.leetcode.samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
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

    Example 4:
    Input: s = "([])"
    Output: true

    Example 5:
    Input: s = "([)]"
    Output: false

    Constraints:
    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {
    /*
        Time Complexity: O(n) - We iterate through the string once
        Space Complexity: O(n) - In the worst case, we push all characters to the stack
     */
    public boolean isValid(String input) {
        Map<Character, Character> matchingParentheses = new HashMap<>();
        matchingParentheses.put(')', '(');
        matchingParentheses.put('}', '{');
        matchingParentheses.put(']', '[');

        Stack<Character> charStack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (matchingParentheses.containsKey(c)) {
                if (charStack.empty() || charStack.pop() != matchingParentheses.get(c)) {
                    return false;
                }
            } else {
                charStack.push(c);
            }
        }
        return charStack.empty();
    }
}
