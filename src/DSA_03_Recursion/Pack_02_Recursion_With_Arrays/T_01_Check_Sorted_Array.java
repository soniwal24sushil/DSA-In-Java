package DSA_03_Recursion.Pack_02_Recursion_With_Arrays;

public class T_01_Check_Sorted_Array {

    // Todo:- Check whether an array is sorted or not.
    public static boolean isSortedArray(int[] arr) {
        return solve(arr, 0);
    }

    private static boolean solve(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] <= arr[idx + 1]) {
            return solve(arr, idx + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6};
        System.out.println(isSortedArray(arr));
    }
}
