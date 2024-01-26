package DSA_03_Recursion.Pack_01_Recursion_Basics;

public class T_03_Sum_of_Digits {

    // Todo:- Return the sum of all the digits of a number.
    public static int digitSum(int num) {
        int rem = num % 10;
        if (rem == num) {
            return num;
        }
        return rem + digitSum(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(14203));
    }
}
