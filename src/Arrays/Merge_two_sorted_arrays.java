package Arrays;
import java.util.Arrays;

public class Merge_two_sorted_arrays {
    public static void main(String[] args) {
        int [] arr1={1,3,4,6,7,9};
        int [] arr2={2,5,8};
        int [] arr3= new int[arr1.length + arr2.length];
        merge(arr1, arr2, arr3);
        // print(arr3);
    }
    static void merge(int[] arr1, int[] arr2, int [] arr3){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i< arr1.length && j< arr2.length){
            if(arr1[i]>arr2[j]){
                arr3[k++]=arr2[j++];
            }
            arr3[k++]=arr1[i++];
        }
        while (i<arr1.length-1) {
            arr3[k++]=arr1[i++];
        }
        while(j<arr2.length-1){
            arr3[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
