package com.interview.code.cracking;

public class StringCompression {

    public String compressedString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        char prevChar = 0;
        int charCount = 1;

        for (char currentChar : str.toCharArray()) {
            if (currentChar == prevChar) {
                charCount++;
            } else {
                if (charCount > 1) {
                    sb.append(charCount);
                    charCount = 1;
                }
                sb.append(currentChar);
            }
            prevChar = currentChar;
        }

        if (charCount > 1) {
            sb.append(charCount);
        }

        return sb.toString();
    }
}
