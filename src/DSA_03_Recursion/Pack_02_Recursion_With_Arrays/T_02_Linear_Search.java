package DSA_03_Recursion.Pack_02_Recursion_With_Arrays;

public class T_02_Linear_Search {

    // Todo:- Recursive Linear Search.
    public static int search(int[] arr, int target) {
        return solve(arr, 0, target);
    }

    private static int solve(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        } else {
            return solve(arr, idx + 1, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 5, 0};
        System.out.println(search(arr, 6));
    }
}
