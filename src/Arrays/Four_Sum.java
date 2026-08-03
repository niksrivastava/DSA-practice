package Arrays;


import java.util.*;

public class Four_Sum {
    public static void main(String[] args) {
        int arr[] = {-3,-1,0,2,4,5};
        int target = 2;
        List<List<Integer>> result = four_sum(arr, target);
        System.out.println(result);
    }
    public static List<List<Integer>> four_sum(int arr[], int target){
            List<List<Integer>> result = new ArrayList<>();

        if (arr == null || arr.length < 4) {
        return result;
        }

            Arrays.sort(arr);

            int n = arr.length;
            long sum = 0;

        for(int i = 0; i< n-3; i++){
            
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for(int j = i+1; j < n-2; j++){
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                
            int left = j+1;
            int right = n-1;

            while(left<right){

                sum = (long)arr[i] + arr[left] + arr[right] + arr[j];

                if(sum == target){
                    List<Integer> ans =  Arrays.asList(
                        arr[i],
                        arr[left],
                        arr[right],
                        arr[j]
                    );

                    if(!result.contains(ans)){
                        result.add(ans);
                    }

                    left++;
                    right--;

                    while (left < right &&
                        arr[left] == arr[left - 1]) {
                        left++;
                    }

                    
                    while (left < right &&
                        arr[right] == arr[right + 1]) {
                        right--;
                    }


                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }

            }


            sum = 0;

            }
        }

        return result;
    }
}
