package Arrays;
import java.util.Arrays;

public class Reverse_an_Array {
    public static void main(String[] args) {
        int [] arr= {5,8,2,0,6,1,8};
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            swap(arr,arr[s],arr[e]);
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int [] arr, int a, int b){
        int t = arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}
