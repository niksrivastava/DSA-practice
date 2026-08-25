package DsaPatterns.TwoPointers;

import java.util.Arrays;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int arr[] = {1,1,3,4};
        int ans = trianlges(arr);
        System.out.println(ans);
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
}
