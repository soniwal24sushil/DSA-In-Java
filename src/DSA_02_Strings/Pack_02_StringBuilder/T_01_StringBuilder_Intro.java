package DSA_02_Strings.Pack_02_StringBuilder;

public class T_01_StringBuilder_Intro {

    public static void main(String[] args) {
        /* StringBuilder Constructors :- There are 3 constructors. */

        // ? (1):- It creates an empty String builder with the initial capacity of 16.
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);

        // ? (2):- It creates a String builder with the specified string.
        StringBuilder sb2 = new StringBuilder("Sushil");
        System.out.println(sb2);

        // ? (3):- It creates an empty String builder with the specified capacity.
        StringBuilder sb3 = new StringBuilder(10);
        System.out.println(sb3);
    }
}
