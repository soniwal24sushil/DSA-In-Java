package DSA_03_Recursion.Pack_04_Recursion_With_Strings;

public class T_01_Skip_a_Character {

    // Todo:- Remove character 'S' from a given string.

    // * Method-01:- By passing an "ans" string in parameters.
    public static String skipChar(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        char ch = str.charAt(0);
        if (ch == 'S') {
            return skipChar(str.substring(1), ans);
        }
        return skipChar(str.substring(1), ans + ch);
    }

    // * Method-02:- By passing an "ans" string in function body.
    public static String skipChar(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'S') {
            return skipChar(str.substring(1));
        }
        return ch + skipChar(str.substring(1));
    }

    public static void main(String[] args) {
//        System.out.println(skipChar("Sushil", ""));
        System.out.println(skipChar("Sushil"));
    }
}
