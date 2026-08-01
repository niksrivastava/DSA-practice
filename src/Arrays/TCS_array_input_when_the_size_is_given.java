package Arrays;
import java.util.*;

public class TCS_array_input_when_the_size_is_given {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // --normal array when input is given...

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        // -- for dynamic array when the size is given...

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }    
}
