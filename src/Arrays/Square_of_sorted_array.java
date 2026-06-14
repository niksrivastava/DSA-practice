package Arrays;

import java.util.Arrays;

public class Square_of_sorted_array {
    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 5};
        int [] ans = sqrt(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sqrt(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                ans[index] = leftSq;
                left++;
            } else {
                ans[index] = rightSq;
                right--;
            }

            index--;
        }

        return ans;
    }
}

