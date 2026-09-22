package com.nikhil.DsaPatterns.SlowAndFastPointer;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = duplicate(arr);
        System.out.println(ans);
    }

    public static int duplicate(int arr[]){

        int fast = 0;
        int slow = 0;

        while(true){
            slow = arr[slow];
            fast = arr[fast];
            fast = arr[fast];

            if(slow == fast){
                slow = 0;
                break;
            }
        }

        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }
}
