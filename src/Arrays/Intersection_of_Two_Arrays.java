package Arrays;

import java.util.Arrays;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int [] num1 = {1,2,2,1};
        int [] num2 = {2,2};
        int ans[] = intersection(num1, num2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersection(int num1[] , int num2[]){
        int[] num3;
        if(num1.length > num2.length){
            num3 = new int[num2.length];
        }
        else{
            num3 = new int[num1.length];
        }
        int k = 0;

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if(num1[i] == num2[j]){
                    num3[k] = num2[j];
                    k++;
                    num2[j] =-1;
                    break;
                }
            }
        }
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = num3[i];
        }

        return num3;

    }
}
