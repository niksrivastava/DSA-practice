package Recursion;

public class Reverse_string {
    public static void main(String[] args) {
        String name = "nikhil";
        char[] arr = name.toCharArray();
        reverse(arr, 0, name.length()-1);
        System.out.println(arr);
    }
    static void reverse(char[] arr, int i, int j){
        
        if(i>=j){
            return ;
        }

        swap(arr, i, j);
        i++;
        j--;

        reverse(arr, i, j);
    }
    static void swap(char[] arr , int s , int e){
        char t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
    }
}
