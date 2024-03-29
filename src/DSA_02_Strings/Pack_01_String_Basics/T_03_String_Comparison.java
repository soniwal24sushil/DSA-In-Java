package DSA_02_Strings.Pack_01_String_Basics;

public class T_03_String_Comparison {

    // * (1) Method-01:- By Using (.equals()) => Compares Value.
    public static void comp1() {
        String s1 = "Sushil";
        String s2 = new String("Sushil");
        String s3 = "SUSHIL";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }

    // * (2) Method-02:- By Using (==) => Compares Reference Not Values.
    public static void comp2() {
        String s1 = "Sushil";
        String s2 = "Sushil";
        String s3 = new String("Sushil");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }

    // * (3) Method-03:- By Using (.compareTo()) => Compares Values Lexicographically.
    public static void comp3() {
        String s1 = "sushil";
        String s2 = "soniwal";
        String s3 = new String("sushil");

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s3));
    }

    public static void main(String[] args) {
        comp1();
        comp2();
        comp3();
    }
}
