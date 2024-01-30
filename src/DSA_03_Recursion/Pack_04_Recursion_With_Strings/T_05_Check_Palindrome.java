package DSA_03_Recursion.Pack_04_Recursion_With_Strings;

public class T_05_Check_Palindrome {

    // Todo:- Check Whether A Given String Is Palindrome Or Not.

    public static boolean isStringPalindrome(String str) {
        return solve(str, 0, str.length() - 1);
    }

    private static boolean solve(String str, int left, int right) {
        if (left == right) {
            return true;
        }

        char left_char = str.charAt(left);
        char right_char = str.charAt(right);

        if (left_char != right_char) {
            return false;
        }

        return solve(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("raacecar"));
    }
}
