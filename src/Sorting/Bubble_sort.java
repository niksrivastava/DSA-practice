package Sorting;
import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 9, 1};
        b_s(arr);
    }

    static void b_s(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}