package Sorting_Searching;
public class RBS {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(findpivot(arr));
        
    }

    static int search(int [] nums, int target, int s, int e){
        int pivot = findpivot(nums);
// if you did not find a pivot , it means the array is not rotated
        if(pivot == -1){
            return binarysearch(nums , target, 0, nums.length - 1);
        }

// if pivot is found , you have found 2 Asc sorted arrays
        if(nums[pivot] == target){
            return pivot;
        }

        if(target >= nums[0]){
            return binarysearch(nums, target, 0, pivot - 1);
        }else{
            return binarysearch(nums, target, pivot + 1, nums.length - 1);
        }

    }

    static int binarysearch(int[] arr, int target, int s, int e){
        
        for(; s <= e;){
            int m = s +(e - s)/2;
            if (target > arr[m]){
                s = m + 1;
            }else if(target < arr[m]){
                e = m - 1;
            }else return m;
        }
        return -1;
    }

    static int findpivot(int [] arr){
        int s = 0;
        int e = arr.length -1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(m < e && arr[m] > arr[m + 1]){
                return m;
            }
            if(m > s && arr[m] < arr[m - 1]){
                return m - 1;
            }
            if(arr[s] >= arr[m]){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return -1;
    }
}
