package com.personal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

    /**
     * ReverseString using ByteArray
     * @param input
     * @return String
     */
    private static String reverseString1(String input) {
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte [strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }

        return new String(result);
    }

    /**
     * ReverseString using StringBuilder
     * @param input
     * @return String
     */
    private static String reverseString2(String input) {
        StringBuilder input1 = new StringBuilder();
        input1.append(input);

        return input1.reverse().toString();
    }

    /**
     * ReverseString by converting string to characters one by one
     * @param input
     * @return String
     */
    private static String reverseString3(String input) {
        String output = "";
        char[] try1 = input.toCharArray();

        for (int i = try1.length-1; i >= 0; i--) {
            output += try1[i];
        }

        return output;
    }

    /**
     * ReverseString using swapping
     * @param input
     * @return String
     */
    private static String reverseString4(String input) {
        String output = "";
        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;

        for (left = 0; left < right ; left++,right--)
        {
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right]=temp;
        }

        for (char c : temparray) {
            output += c;
        }

        return output;
    }

    /**
     * ReverseString using ListIterator
     * @param input
     * @return String
     */
    private static String reverseString5(String input) {
        String output = "";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();

        for (char c: hello) {
            trial1.add(c);
        }

        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();

        while (li.hasNext()) {
            output += li.next();
        }

        return output;
    }

    public static void main(String[] args) {
        String input = "As We Go From Here";

        System.out.println("reverseString1: " + reverseString1(input));
        System.out.println("reverseString2: " + reverseString2(input));
        System.out.println("reverseString3: " + reverseString3(input));
        System.out.println("reverseString4: " + reverseString4(input));
        System.out.println("reverseString5: " + reverseString5(input));
    }
}