package DSA_03_Recursion.Pack_04_Recursion_With_Strings;

public class T_04_Calculate_Length_of_a_String {

    // Todo:- Calculate the length of a given string using recursion.
    public static int strLen(String str, int len) {
        if (str.isEmpty()) {
            return len;
        }
        return strLen(str.substring(1), len + 1);
    }

    public static void main(String[] args) {
        System.out.println(strLen("Sushil Soniwal", 0));
    }
}
