package Recursion;
public class BS_with_recursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target = 56;
        System.out.println(BS_recursion(arr, target,0,(arr.length-1)));
    }
    static int BS_recursion(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;
        if(arr[m]==target){
            return m;
        }

        if(arr[m]<target){
            return BS_recursion(arr, target, m+1, e);
        }
        else{
            return BS_recursion(arr, target, s, m-1);
        }
    }
}
