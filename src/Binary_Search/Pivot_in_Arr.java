package Binary_Search;
public class Pivot_in_Arr {
    static int bi_search(int[] arr){
        int s =0;
        int e = arr.length-1;
        int m = s+ (e-s)/2;
        while(s<=e){
            if(arr.length==0){
                return -1;
            }
            if(arr[m]<arr[m+1] && arr[m]<arr[m-1]){
                return m;
            }
            else if(arr[m-1]>arr[m+1]){
                s=m;
            }
            else{
                e=m;
            }
            m = s + (e-s)/2;
        }return -1;
    }
    public static void main(String[] args) {
        int[] arr={};
        int search=bi_search(arr);
        System.out.println(search);
    }
}
