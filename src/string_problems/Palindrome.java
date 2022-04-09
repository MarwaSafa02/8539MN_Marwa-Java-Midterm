package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        String str1, str2, str3;

        str1= "MADAM";
        str2 = "MADam";
        str3 = "ANT";

        System.out.println(isPalindrome(str1));//true
        System.out.println(isPalindrome(str2));//true
        System.out.println(isPalindrome(str3));//false
    }
    // Implement here

    // Pointers pointing to the beginning and the end of the string
    // While there are characters to compare
    // --If there is a mismatch return false
    // --Increment first pointer and
    // --decrement the other
    // -- no mismatch then true
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
