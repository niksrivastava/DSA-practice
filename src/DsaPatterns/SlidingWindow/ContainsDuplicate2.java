package DsaPatterns.SlidingWindow;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3};
        int k = 2;
        boolean ans = duplicate(arr, k);
        System.out.println(ans);

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
}
