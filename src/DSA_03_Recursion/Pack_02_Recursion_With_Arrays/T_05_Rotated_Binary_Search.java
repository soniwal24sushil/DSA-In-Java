package DSA_03_Recursion.Pack_02_Recursion_With_Arrays;

public class T_05_Rotated_Binary_Search {

    // Todo:- Rotated Binary Search Using Recursion.
    public static int RBS(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return RBS(arr, start, mid - 1, target);
            } else {
                return RBS(arr, mid + 1, end, target);
            }
        } else {
            if (target > arr[mid] && target <= arr[end]) {
                return RBS(arr, mid + 1, end, target);
            } else {
                return RBS(arr, start, mid - 1, target);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(RBS(arr, 0, arr.length - 1, 1));
    }
}
