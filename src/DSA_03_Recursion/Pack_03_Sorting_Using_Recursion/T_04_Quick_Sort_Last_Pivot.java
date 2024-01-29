package DSA_03_Recursion.Pack_03_Sorting_Using_Recursion;

import java.util.Arrays;

public class T_04_Quick_Sort_Last_Pivot {

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot_idx = partition(arr, low, high);
            sort(arr, low, pivot_idx - 1);
            sort(arr, pivot_idx + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {20, 17, 34, 40, 18, 30};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
