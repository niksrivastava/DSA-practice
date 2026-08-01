package Arrays;
import java.util.*;
public class TCS_array_input_when_then_size_is_not_given {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -- input for the space and comma saperated  values...
        String str = sc.nextLine();

        
        String nums[] = str.split(",");

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int num = Integer.parseInt(nums[i]);
            list.add(num);
        }

        for(int j = 0; j < list.size(); j++){
            System.out.print(list.get(j) + " ");
        }

        
        // -- input for the space and comma saperated  values and also they are inside brackets ...
        String str2 = sc.nextLine().trim();

        if(str2.startsWith("[") && str2.endsWith("]")){
            str2 = str2.substring(1, str2.length()-1);
        }

        String nums2[] = str2.split(",");

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < nums2.length; i++){
            int num2 = Integer.parseInt(nums2[i].trim());
            list2.add(num2);
        }

        for(int j = 0; j < list2.size(); j++){
            System.out.print(list2.get(j) + " ");
        }

        sc.close();
    }
}
