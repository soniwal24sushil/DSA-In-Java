package DSA_03_Recursion.Pack_01_Recursion_Basics;

public class T_04_Product_of_Digits {

    // Todo:- Return the product of all the digits of a number.
    public static int digitProduct(int num) {
        int rem = num % 10;
        if (rem == num) {
            return num;
        }
        return rem * digitProduct(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitProduct(14203));
    }
}
