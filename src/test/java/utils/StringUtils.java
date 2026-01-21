package utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class StringUtils {

    public static String reverseStringEasy(String inputString) {
        if (inputString == null)
            return null;
        return new StringBuilder(inputString).reverse().toString();
    }


    public static String reverseStringPro(String inputString) {
        if (inputString == null)
            return null;

        char[] chars = inputString.toCharArray();
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static Set<Character> findDuplicatesChar(String input) {

        if (input == null)
            return null;

        Set<Character> duplicates = new HashSet<>();
        Set<Character> seen = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (c == ' ')
                continue;

            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }
        return duplicates;
    }

    public static boolean areAnagrams(String word1, String word2) {
        //if length is different they cannot be anagrams
        if (word1 == null || word2 == null || word1.length() != word2.length())
            return false;

        Map<Character, Integer> charCounterMap = new HashMap<>();

        //Count frequency for word 1

        for (char c : word1.toCharArray()) {
            charCounterMap.put(c, charCounterMap.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            if (!charCounterMap.containsKey(c)) {
                return false; // char in word 2 not found in word 1
            }

            charCounterMap.put(c, charCounterMap.get(c) - 1);

            if (charCounterMap.get(c) < 0) {
                return false; // more occurrences on word 2 than word 1
            }
        }
            return true;
        }
    }
