package Recursion;

import java.util.ArrayList;

public class Linear_search_with_recursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3523,4,853};
        System.out.println(LS_value(arr,0,0)+"," + " Which means: " +LS_bool(arr, 0, 0));
        int arr2[] = {1,2,4,6,8,5,2,6};
        System.out.println(find_all_index(arr2, 0, 2, new ArrayList<>()));
        int arr3[] = {1,2,4,6,8,5,2,6,6,3,8,2};
        System.out.println(find_all_index(arr3, 0, 2));
    }

    static int LS_value(int arr[] , int index, int target){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return LS_value(arr, index + 1, target);
    }

    static boolean LS_bool(int arr[] , int index, int target){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || LS_bool(arr, index + 1, target);
    }

    static ArrayList<Integer> find_all_index(int arr[] , int index, int target, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return find_all_index(arr, index + 1, target, list);
    }

    static ArrayList<Integer> find_all_index(int arr[] , int index, int target){
        
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ans_from_below_calls = find_all_index(arr, index + 1, target);

        list.addAll(ans_from_below_calls);

        return list;
    }

    
}
