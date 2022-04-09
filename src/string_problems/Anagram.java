package string_problems;

import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args) {
        String str1, str2, str3, str4;

        str1 = "ARMY";
        str2 = "MARY";

        str3 = "ARMYX";
        str4 = "MARY";

        System.out.println(isAnagram(str1, str2));// should be true
        System.out.println(isAnagram(str3, str4));// should be false
    }

    // analyze letter by letter -- break the strings -- convert them to array
    //{'A', 'R', 'M', 'Y'}, {'M', 'A', 'R', 'Y'}
    //if the lengths are not equal then false
    //sort the letters of each array
    //if they are equal then return true
    public static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}
