package DSA_03_Recursion.Pack_03_Sorting_Using_Recursion;

import java.util.Arrays;

public class T_03_Quick_Sort_Middle_Pivot {

    /**
     * Quick Sort:- Sort An Array By Partition.
     * T.C:- O(n*log(n)).
     * S.C:- O(n).
     */

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int start = low, end = high;
            int mid = (start + end) / 2;
            int pivot = arr[mid];

            while (start <= end) {
                while (arr[start] < pivot)
                    start++;
                while (arr[end] > pivot)
                    end--;

                if (start <= end) {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }

            sort(arr, low, end);
            sort(arr, start, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 17, 34, 40, 18, 30};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
