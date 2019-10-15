package com.interview.code.cracking;

import java.util.ArrayList;
import java.util.List;

public class UniqueChars {

    public boolean hasUniqueChars(String str) {

        List<Character> chars = new ArrayList<>();

        for(Character c : str.toCharArray()) {
            if(chars.contains(c)) {
                return false;
            }
            chars.add(c);
        }

        return true;
    }
}
