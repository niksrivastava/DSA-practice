package DsaPatterns.TwoPointers;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args) {
        int arr[] = {3,5,3,4};
        int limit = 5;
        int ans = boats(arr, limit);
        System.out.println(ans);
    }
    public static int boats(int [] arr, int limit){

        int boat = 0;

        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            if(arr[i] + arr[j] <= limit){
                boat += 1;
                i++;
                j--;
            }else{
                boat += 1;
                j--;
            }
        }

        return boat;
    }
}
