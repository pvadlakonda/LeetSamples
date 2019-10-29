package com.leetcode.samples;

import java.util.HashMap;

public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {

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
}


