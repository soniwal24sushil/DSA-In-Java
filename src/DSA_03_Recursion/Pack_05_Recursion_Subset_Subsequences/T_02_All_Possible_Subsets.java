package DSA_03_Recursion.Pack_05_Recursion_Subset_Subsequences;

import java.util.ArrayList;

public class T_02_All_Possible_Subsets {

    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static void subset(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(arr, ans, 0);
    }

    private static void solve(int[] arr, ArrayList<Integer> ans, int idx) {
        if (idx == arr.length) {
            result.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[idx]);
        solve(arr, ans, idx + 1);
        ans.remove(ans.size() - 1); // Remove the last element
        solve(arr, ans, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subset(arr);
        System.out.println(result);
    }
}

