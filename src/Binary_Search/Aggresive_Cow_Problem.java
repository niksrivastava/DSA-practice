package Binary_Search;
import java.util.Arrays;

public class Aggresive_Cow_Problem {
    public static void main(String[] args) {
        int[] arr_of_cow_distance = {4,2,1,3,6};
        int search = bi_search(arr_of_cow_distance, 2);
        System.out.println(search);
    }

    static int bi_search(int[] arr, int k){
        Arrays.sort(arr);
        int ans = -1;
        int s =0;
        int maxi = -1;
        for(int i = 0; i < arr.length-1; i++){
            maxi = Math.max(maxi, arr[i]);

        }
        int e = maxi;
        int m = s+ (e-s)/2;
        while(s<=e){
            if(is_possible(arr, k, m)){
                ans = m;
                s = m+1;
            }
            else{
                e=m-1;
            }
            m= s+(e-s)/2;
        }
        return ans;
    }

    static boolean is_possible(int arr[], int k, int m ){

        int cow_count = 1;
        int last_pos = arr[0];
        for(int i = 0; i < arr.length-1;i++){
            if(arr[i]-last_pos >= m){
                cow_count++;
                if(cow_count==k){
                    return true;
                }
                last_pos = arr[i];
            }
        }
        return false;
    }
}
