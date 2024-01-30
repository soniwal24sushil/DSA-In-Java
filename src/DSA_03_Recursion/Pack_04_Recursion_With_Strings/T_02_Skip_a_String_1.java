package DSA_03_Recursion.Pack_04_Recursion_With_Strings;

public class T_02_Skip_a_String_1 {

    // Todo:- Skip the string that starts with "Brown".

    // * Method-01:- By passing an "ans" string in parameters.
    public static String skipString(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        if (str.startsWith("Brown")) {
            return skipString(str.substring(5), ans);
        }
        char ch = str.charAt(0);
        return skipString(str.substring(1), ans + ch);
    }

    // * Method-02:- By passing an "ans" string in parameters.
    public static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("Brown")) {
            return skipString(str.substring(5));
        }
        char ch = str.charAt(0);
        return ch + skipString(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(skipString("That Greedy Brown Fox Is Hungry", ""));
        System.out.println(skipString("That Greedy Brown Fox Is Hungry"));
    }
}
