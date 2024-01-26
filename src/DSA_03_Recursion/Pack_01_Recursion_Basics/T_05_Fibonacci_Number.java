package DSA_03_Recursion.Pack_01_Recursion_Basics;

public class T_05_Fibonacci_Number {

    // Todo:- Return The Nth Fibonacci Number.
    public static int fibNum(int n) {
        if (n <= 1) {
            return n;
        }
        return fibNum(n - 1) + fibNum(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibNum(7));
    }
}
