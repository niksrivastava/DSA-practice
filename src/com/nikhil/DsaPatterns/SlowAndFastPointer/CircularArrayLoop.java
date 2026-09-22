package com.nikhil.DsaPatterns.SlowAndFastPointer;

import java.util.HashSet;

public class CircularArrayLoop {
    public static void main(String[] args) {
        int arr[] = {2,-1,1,2,2};
        boolean ans = loop(arr);
        System.out.println(ans);
    }

    public static boolean loop(int arr[]){
        
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            
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
