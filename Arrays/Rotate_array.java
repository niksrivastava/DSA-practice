import java.util.Arrays;

public class Rotate_array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        
        rotate(arr1,3);

    }
    static void rotate(int [] arr1, int k){
        int [] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[(i+k)%arr1.length]= arr1[i];
        }
        arr1=arr2;
        System.out.println(Arrays.toString(arr2));
    }
}
