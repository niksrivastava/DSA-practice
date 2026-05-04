package Arrays;
import java.util.*;
public class SortedCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for(int i = 0; i < arr.length- 1; i++){
            if(arr[ i + 1 ] < arr[i]){
                sorted = false;
                break;
            }
            // System.out.println("Array is not Sorted in ascending order");
        }
        if(sorted){
            System.out.println("Array is Sorted in ascending order");
        }
        else{
            System.out.println("Array is not Sorted in ascending order");
        }
        // System.out.println("Array is Sorted in ascending order");
        sc.close();
    }
}
