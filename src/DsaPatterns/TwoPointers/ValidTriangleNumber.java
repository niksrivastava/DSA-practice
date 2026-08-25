package DsaPatterns.TwoPointers;

import java.util.Arrays;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4};
        int ans = trianlges(arr);
        int optimized = optimizedSolution(arr);
        System.out.println(ans);
        System.out.println(optimized);
    }
    public static int trianlges(int[] arr){
        int ans = 0;

        Arrays.sort(arr);

        int i = 0;
        int j = i+1;


        while(i < arr.length-2){

            while(j<arr.length-1){

                int k = arr.length-1;

                if(arr[i]+arr[j]>arr[k]){
                    ans += 1;
                    k--;
                }else{
                    k--;
                }
                
                while(j < k){

                    if(arr[i]+arr[j]>arr[k]){
                            ans += 1;
                        }
                        k--;
                }
                j++;
            }
            i++;
            j = i+1;
        }
        return ans;
    }

    public static int optimizedSolution(int arr[]){
        int ans = 0;

        Arrays.sort(arr);
        
        int k = arr.length - 1;

        while (k >= 2) {

            int i = 0;
            int j = k - 1;

            while (i < j) {

                if (arr[i] + arr[j] > arr[k]) {
                    ans += j - i;
                    j--;
                } else {
                    i++;
                }
            }

            k--;
        }

        return ans;
    }
}
