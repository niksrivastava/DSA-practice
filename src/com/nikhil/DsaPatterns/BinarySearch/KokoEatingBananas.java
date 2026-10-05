package com.nikhil.DsaPatterns.BinarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int arr[] = {30,11,23,4,20};
        int ans = eatingSpeed(arr, 5);
        System.out.println(ans);
    }

    public static int eatingSpeed(int arr[], int h){
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int s = 1;
        int e = max;
        int result = -1;
        while(s <= e){
            int m = s - (s-e)/2;
            int hour = hours(arr, m);

            if(hour > h){
                s = m+1;
            }
            else{
                result = m;
                e = m-1;
            }
        }
        return result;
    }

    public static int hours(int arr[], int speed){
        int h = 0;
        for (int i = 0; i < arr.length; i++) {
            h = h + arr[i]/speed;
            if(arr[i]%speed != 0){
                h++;
            }
        }
        return h;
    }
}
