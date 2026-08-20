package Arrays;

import java.util.Arrays;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] arr1 = {4,1,2};
        int arr2[] = {1,2,3,4};
        int ans [] = nextGreaterElement1(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] nextGreaterElement1(int arr1[], int arr2[]){
        int ans [] = new int[arr1.length];
        int i = 0;
        int j = 0;
        while(i < arr1.length){
            ans[i] = -1;
            while(j < arr2.length){
                
                if(arr1[i] == arr2[j]){
                    int k = j+1;
                    while(k < arr2.length){
                        if(arr2[k] > arr1[i]){
                            ans[i] = arr2[k];
                            break;
                        }
                            k++;
                    }
                    break;
                }
            j++;
        }
        j = 0;
        i++;
        }
        return ans; 
    }
}
