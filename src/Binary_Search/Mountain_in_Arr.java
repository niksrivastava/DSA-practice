public class Mountain_in_Arr {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,5,3};
        int search = bi_search(arr);
        System.out.println(search);

    }
    static int bi_search(int[] arr){
        int s = 0;
        int e = arr.length -1 ;
        int m= s + (e-s)/2;
        if(arr.length==0){
            return-1;
        }
        while(s<=e){
            if(arr[m]> arr[m+1] && arr[m]>arr[m-1]){
                return m;
            }
            else if(arr[m+1]>arr[m]){
                s = m+1;
            }
            else if(arr[m-1]>arr[m]){
                e=m-1;
            }
            m= s + (e-s)/2;
        }
        return -1;
    }
}
