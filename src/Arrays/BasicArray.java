package Arrays;

import java.util.*;

public class BasicArray {
    public static void main(String[] args) {
        int[] ros;
        ros = new int[5];
        System.out.println(ros[1]);

        Scanner sc = new Scanner(System.in);
        // int[] arr;
        // arr = new int[5];
        // // arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

            String[] str = new String[6];
            for (int j = 0; j < str.length; j++) {
                str[j] = sc.next();
            }
            System.out.println(Arrays.toString(str));
            str[0] = "Nik";
            str[3] = "Nik";
            System.out.println(Arrays.toString(str));

    }
}
