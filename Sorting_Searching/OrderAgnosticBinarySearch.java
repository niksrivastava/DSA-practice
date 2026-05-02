

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int [] arr = {90, 89, 78, 67, 56, 45, 41, 34, 23, 12};
        int [] arr = {2, 4, 6, 7, 23, 34, 45, 56, 57, 67, 89, 90};
        int target = 56;
        int ans = orderagnosticbinarysearch(arr, target);
        System.out.println(ans);
    }   
    static int orderagnosticbinarysearch(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;


        boolean isAsc;
        if(arr[s] < arr[e]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        
        for(s = 0; s <= e;){
            int m = s +(e - s)/2;        
            if(target == arr[m]){
            return m;
        }
        
        if(isAsc){
            if (target > arr[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }else{
            if (target > arr[m]){
                e = m - 1;
            }else{
                s = m + 1;
                }
            }
        }
        return -1;
    }
}

