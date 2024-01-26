package DSA_03_Recursion.Pack_01_Recursion_Basics;

public class T_06_Fibonacci_Sequence {

    // Todo:- Print the fibonacci sequence till n.
    public static void fibSequence(int n) {
        solve(n, 0, 1);
    }

    private static void solve(int n, int a, int b) {
        if (n < 0) {
            return;
        }
        System.out.println(a);
        solve(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        fibSequence(7);
    }
}
