package DsaPatterns.SlidingWindow;

import java.util.HashSet;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3};
        int k = 2;
        boolean ans = duplicate(arr, k);
        System.out.println(ans);
        boolean optimizedAns = duplicateOptimized(arr, k);
        System.out.println(optimizedAns);

    }

    public static boolean duplicate(int arr[], int k){
        boolean ans = false;
        int i = 0;
        
        while(i < arr.length){
            int low = i+1;
            int high = Math.min(i + k, arr.length - 1);

            while(low <= high){
                if(arr[i] == arr[low]){
                    return true;
                }
                low++;
            }
            i++;
            
        }
        return ans;
    }

    public static boolean duplicateOptimized(int arr[], int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                return true;
            }

            set.add(arr[i]);

            if (set.size() > k) {
                set.remove(arr[i - k]);
            }
        }

        return false;
    }
}
