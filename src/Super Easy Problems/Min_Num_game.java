import java.util.Arrays;

public class Min_Num_game {
    public static void main(String[] args) {
        int[] arr = {40,20,10,30};
        Arrays.sort(arr);

        swap(arr,arr.length,0,1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int length, int ind_first, int ind_second){
        if(ind_second>length){
            return;
        }
        int temp = arr[ind_first];
        arr[ind_first]=arr[ind_second];
        arr[ind_second]=temp;
        swap(arr, arr.length, ind_first+2, ind_second+2);
    }
}
