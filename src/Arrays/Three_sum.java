package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_sum {
    public static void main(String[] args) {

        int nums[] = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = three_sum(nums);

        List<List<Integer>> optimised = three_sum_opt(nums);

        System.out.println(result);

        System.out.println(optimised);
    
    }

    public static List<List<Integer>> three_sum(int[] arr){

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
        int n = arr.length;

        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){

                        List<Integer> ans = new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[k]);
                    
                    if(result.contains(ans) == false){
                        result.add(ans);
                    }
                }
            }
        }
    }
        return result;
    }

    public static List<List<Integer>> three_sum_opt(int arr[]){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        int target = 0;

        for(int i = 0; i < n-2; i++){

            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }

            if(arr[i] > 0){
                break;
            }

            target = -1*arr[i];

            int left = i+1;
            int right = n-1;
            
            while(left < right){
                int sum = arr[left] + arr[right]; 
                if(sum == target){

                    // // Important: Arrays.asList() se bani list fixed-size hoti hai. Isme add() ya remove() nahi kar sakte:

                    List<Integer> ans = Arrays.asList(
                        arr[i],
                        arr[left],
                        arr[right]
                    );

                    result.add(ans);

                    left++;
                    right--;

                

                while(left < n && arr[left] == arr[left-1]){
                    left++;
                }

                while(right >= 0 && arr[right] == arr[right+1] ){
                    right--;
                }

            }else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }  
            }
        }
    
        return result;
    }
}

