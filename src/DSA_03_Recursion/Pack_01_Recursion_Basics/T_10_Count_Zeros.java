package DSA_03_Recursion.Pack_01_Recursion_Basics;

public class T_10_Count_Zeros {

    // Todo:- Return The Number Of 0's In A Given Number.
    public static int countZeros(int num, int count) {
        int rem = num % 10;
        if (num == 0) {
            return count;
        }
        if (rem == 0) {
            return countZeros(num / 10, count + 1);
        } else {
            return countZeros(num / 10, count);
        }
    }

    public static void main(String[] args) {
        System.out.println(countZeros(10402, 0));
    }
}
