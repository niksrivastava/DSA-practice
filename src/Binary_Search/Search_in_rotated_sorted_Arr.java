package Binary_Search;
public class Search_in_rotated_sorted_Arr {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2};
        int search=bi_search(arr, 2);
        System.out.println(search);
    }
    static int bi_search(int [] arr, int target){
        int s = 0;
        int e = arr.length-1;
        int m = s+ (e-s)/2;
        if(arr.length==0){
                return -1;
            }
        
         while(s<e){
            
            if(arr[m]>=arr[0]){
                s=m+1;
            
            }
            else{
                e=m;
            }
            m = s + (e-s)/2;
        }
        int pivot = s;
            if(target >= arr[pivot] && target <= arr[arr.length - 1]){
    s = pivot;
    e = arr.length - 1;
}
else{
    s = 0;
    e = pivot - 1;
}

            m = s + (e-s)/2;
            while(s<=e){
                if(arr[m]==target){
                    return m;
                }
                else if(arr[m]>target){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
                m = s + (e-s)/2;
            }
        return -1;
    }
}
