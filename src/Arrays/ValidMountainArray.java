package Arrays;

public class ValidMountainArray {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 4, 2};

        boolean ans = validMountainArray(arr);

        System.out.println(ans);
    }

    public static boolean validMountainArray(int[] arr) {

        int n = arr.length;

        if (n < 3) {
            return false;
        }

        int i = 0;

        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak first ya last element nahi hona chahiye
        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}
