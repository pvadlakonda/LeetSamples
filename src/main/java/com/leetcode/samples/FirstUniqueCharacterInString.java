package com.leetcode.samples;

import java.util.HashMap;

/*
    Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    Example 1:
    Input: s = "leetcode"
    Output: 0
    Explanation:
    The character 'l' at index 0 is the first character that does not occur at any other index.

    Example 2:
    Input: s = "loveleetcode"
    Output: 2

    Example 3:
    Input: s = "aabb"
    Output: -1

    Constraints:
    1 <= s.length <= 105
    s consists of only lowercase English letters.
 */

public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {

        //Time complexity O(n)
        //Space complexity O(n)

        HashMap<Character, MyCharacter> map = new HashMap<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            MyCharacter tmp = new MyCharacter(i);

            if (map.containsKey(chars[i])) {
                tmp.unique = false;
            }
            map.put(chars[i], tmp);
        }

        int uniqueIndex = Integer.MAX_VALUE;

        for (Character myChar : map.keySet()) {
            if (map.get(myChar).unique) {
                uniqueIndex = Math.min(uniqueIndex, map.get(myChar).index);
            }
        }

        return uniqueIndex == Integer.MAX_VALUE ? -1 : uniqueIndex;
    }

    class MyCharacter {
        int index;
        boolean unique = true;

        public MyCharacter(int index) {
            this.index = index;
        }
    }

    public int firstUniqChar2(String s) {
        // Time Complexity O(n)
        // Space complexity O(1)

        int uniqueIndex = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {
            int currIndex = s.indexOf(c);
            if (currIndex != -1 && currIndex == s.lastIndexOf(c)) {
                uniqueIndex = Math.min(uniqueIndex, currIndex);
            }
        }

        return uniqueIndex == Integer.MAX_VALUE ? -1: uniqueIndex;
    }

    public int firstUniqChar3(String s) {
        // Time complexity O(n^2)
        // Space complexity O(n)
        // Since we are using indexOf and lastIndexOf (both are O(n) operations)

        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) return s.indexOf(c);
        }

        return -1;
    }
}


