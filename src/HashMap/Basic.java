package HashMap;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("kunal", 87);
        map.put("Nikhil", 89);
        map.put("karan", 94);

        System.out.println(map.get("Nikhil"));
        System.out.println(map.getOrDefault("anku", 99));
        System.out.println(map.containsKey("Nikhil"));

        HashSet<Integer> set = new HashSet<>();

        set.add(56);
        set.add(5);
        set.add(56);
        set.add(58);
        set.add(50);
        set.add(57);

        System.out.println(set);

        // Inserting array ele into hashmap and counting their frequency..
        int arr[] = {1,3,2,3,2,1,3};
        HashMap<Integer, Integer> newMap = new HashMap<>();

        for(int i = 0; i < arr.length;i++){
            if(newMap.containsKey(arr[i])){
                newMap.put(arr[i], newMap.get(arr[i]) + 1);
            }
            else{
                newMap.put(arr[i], 1);
            }
        }

        System.out.println(newMap);
        System.out.print(newMap.size());

    }
    
}
