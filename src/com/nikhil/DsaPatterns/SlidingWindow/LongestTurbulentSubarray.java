package com.nikhil.DsaPatterns.SlidingWindow;

public class LongestTurbulentSubarray {
    public static void main(String[] args) {
        int arr[] = {0,8,45,88,48,68,28,55,17,24};
        int ans = longestSubarray(arr);
        System.out.println(ans);
    }

    public static int longestSubarray(int arr[]){
        int n = arr.length;

        if (n == 1) {
            return 1;
        }

        int i = 0;
        int j = 1;
        int len = 1;

        while (j < n) {

            if (arr[j] == arr[j - 1]) {
                i = j;
                j++;
            }

            else if (j == i + 1) {
                j++;
                len = Math.max(len, j - i);
            }

            else if ((arr[j - 2] < arr[j - 1] && arr[j - 1] > arr[j]) ||
                     (arr[j - 2] > arr[j - 1] && arr[j - 1] < arr[j])) {

                j++;
                len = Math.max(len, j - i);

            }

            else {
                i = j - 1;
            }
        }

        return len;
    }
}
