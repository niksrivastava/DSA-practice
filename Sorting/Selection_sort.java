import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 9, 1};
        s_s(arr);
    }

    static void s_s(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            swap(arr, i, min_index);
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}