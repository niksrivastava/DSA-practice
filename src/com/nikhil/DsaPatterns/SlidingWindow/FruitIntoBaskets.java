package com.nikhil.DsaPatterns.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2};
        int ans = fruit(arr);
        System.out.println(ans);
    }

    public static int fruit(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = 0;
        int maxLen = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while(right < n) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > 2) {
                int leftFruit = arr[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0)
                    map.remove(leftFruit);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;

    }
}
