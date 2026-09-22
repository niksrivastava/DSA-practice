package com.nikhil.DsaPatterns.SlowAndFastPointer;

import java.util.HashSet;

public class CircularArrayLoop {
    public static void main(String[] args) {
        int arr[] = {2,-1,1,2,2};
        boolean ans = loop(arr);
        System.out.println(ans);

        boolean optimizedAns = optimized(arr);
        System.out.println(optimizedAns);
    }

    public static boolean loop(int arr[]){
        
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == 0){
                continue;
            }
            boolean isPos = arr[i] > 0;
            int current = i;

            while(true){

                int next = nextIndex(arr, current);

                if(isPos){
                    if(arr[next] < 0){
                        break;
                    }
                    else{
                        if(set.contains(next)){

                            if(current != next){
                                return true;
                            }
                            else{
                                break;
                            }
                        }

                        set.add(next);
                    }
                }
                else{
                    if(arr[next] > 0){
                        break;
                    }
                    else{
                        if(set.contains(next)){

                            if(current != next){
                                return true;
                            }
                            else{
                                break;
                            }
                        }

                        set.add(next);
                    }
                }

                current = next;
            }

            set.clear();
        
            current = i;

            if(isPos){
                while(arr[current] > 0){
                    int next = nextIndex(arr, current);
                    arr[current] = 0;
                    current = next;
                }
            }
            else{
                while(arr[current] < 0){
                    int next = nextIndex(arr, current);
                    arr[current] = 0;
                    current = next;
                }
            }
        
        }

        return false;
    }

    public static boolean optimized(int arr[]){

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == 0){
                continue;
            }

            int slow = i;
            int fast = i;

            boolean isPos = arr[i] > 0;

            do{
                slow = nextIndex(arr, slow);
                fast = nextIndex(arr, fast);

                if(isPos){
                    if(arr[fast] < 0){
                        break;
                    }
                }
                else{
                    if(arr[fast] > 0){
                        break;
                    }
                }

                fast = nextIndex(arr, fast);

                if(isPos){
                    if(arr[fast] < 0){
                        break;
                    }
                }
                else{
                    if(arr[fast] > 0){
                        break;
                    }
                }
                if(slow == fast){
                    if(slow != nextIndex(arr, slow)){
                        return true;
                    }
                    break;
                }

            }while(slow != fast);

            int current = i;

            if(isPos){
                while(arr[current] > 0){
                    int next = nextIndex(arr, current);
                    arr[current] = 0;
                    current = next;
                }
            }
            else{
                while(arr[current] < 0){
                    int next = nextIndex(arr, current);
                    arr[current] = 0;
                    current = next;
                }
            }

        }

        return false;
    } 

    public static int nextIndex(int[] arr, int current){
        int next = current;

        int seq = arr[current];

        if(seq > 0){

            next = (next + seq) % arr.length;
        }
        else{

            int mod = seq % arr.length;
            int forward = arr.length + mod;
            next = (current+forward) % arr.length;
        }

        return next;
    }
}
