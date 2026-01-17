package utils;

import java.util.ArrayList;

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
}
