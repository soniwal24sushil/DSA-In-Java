package DSA_03_Recursion.Pack_02_Recursion_With_Arrays;

import java.util.ArrayList;

public class T_03_Linear_Search_With_Multiple_Occurrences {

    // Todo:- Return All The Occurrences Of A Target Element In An Given Array.

    /**
     * (1) By Creating An Static ArrayList Outside The Function Body.
     * (2) Whenever We'll Make Any Change In This List Inside The Function Body, It
     * Will Automatically Reflect In The Outside Created List.
     * (3) Time Complexity = O(n) & Space Complexity = O(n).
     */

    static ArrayList<Integer> ans = new ArrayList<>();

    public static void search1(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == target) {
            ans.add(idx);
        }
        search1(arr, idx + 1, target);
    }
    // -------------------------------------------------------------------------------------

    /**
     * (1) By Passing An ArrayList In The Parameters Of The Function.
     * (2) In This Way The List Will Be Available For Every Function Call.
     * (3) Whenever We'll Made Any Change In This List Inside The Function Body, The
     * Original List Will Also Be Modified, Because Multiple Reference Variables But
     * Pointing To The Same Object.
     * (4) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static ArrayList<Integer> search2(int[] arr, int idx, int target, ArrayList<Integer> ansList) {
        if (idx == arr.length) {
            return ansList;
        }
        if (arr[idx] == target) {
            ansList.add(idx);
        }
        return search2(arr, idx + 1, target, ansList);
    }
    // -------------------------------------------------------------------------------------

    /**
     * (1) By Passing An ArrayList In The Function Body.
     * (2) In This Way For Every New Function Call A New List Will Be Created.
     * (3) Whenever Changes Been Made Via A Function Call, It Will Be Avalible Fot
     * That Function Call Only.
     * (4) We Have To Combine All The Answers To Get The Actual Answer.
     * (5) Time Complexity = O(n) & Space Complexity = O(n).
     */

    public static ArrayList<Integer> search3(int[] arr, int idx, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        if (idx == arr.length) {
            return result;
        }
        if (arr[idx] == target) {
            result.add(idx);
        }

        ArrayList<Integer> ansFromBelowCalls = search3(arr, idx + 1, target);
        result.addAll(ansFromBelowCalls);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        search1(arr, 0, 4);
        System.out.println(ans);

        System.out.println(search2(arr, 0, 4, new ArrayList<>()));

        System.out.println(search3(arr, 0, 4));
    }
}
