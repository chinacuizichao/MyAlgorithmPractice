package com.roger.algorithm.medium;

import java.util.HashSet;

/**
 * 1. 考虑情况全面，考虑传空字符串的可能
 * 2. 右边的角标可以用一个max来记录
 */

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {


    }

//    public static int lengthOfLongestSubstring(String s) {
//        HashMap uniqueCollection = new HashMap<String, Integer>();
//
//        for (int leftIndex = 0, length = s.length(), rightIndex = 0; leftIndex < length; leftIndex++) {
//            Character character = s.charAt(leftIndex);
//
//            if (uniqueCollection.get(character) == null) {
//                uniqueCollection.put(character, leftIndex);
//            } else {
//                if (uniqueCollection.get(character))
//            }
//
//
//        }
//    }

    /**
     * 解法1
     */
    public static int method1(String s) {
        int lengthOfLongestSubstring = 0;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (allUnique(s, i, j)) {
                    lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, j - i);
                }

            }
        }
        return lengthOfLongestSubstring;
    }

    public static boolean allUnique(String s, int start, int end) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = start; i < end; i++) {
            char character = s.charAt(i);
            if (hashSet.contains(character)) {
                return false;
            } else {
                hashSet.add(character);
            }
        }
        return true;
    }
}
