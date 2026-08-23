package DsaPatterns.TwoPointers;

import java.util.*;

public class CountPairsWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(-6,2,5,-2,-7,-1,3));
        int target = -2;
        int ans = count(list, target); 
        System.out.println(ans);

    }
    public static int count(List<Integer> list, int target){
        int count = 0;
        Collections.sort(list);
        int i = 0;
        int j = list.size()-1;
        while(i<j){
            if(list.get(i) + list.get(j) >= target){
                j--;
            }
            else if(list.get(i) + list.get(j) < target){
                count += j - i;
                i++;
            }
        }



        return count;
    }
}
