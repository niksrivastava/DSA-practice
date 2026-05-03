package Super_Easy_Problems;

public class Number_of_emp_who_met_the_target {
    public static void main(String[] args) {
        
        int [] hours = {0,1,2,3,4};
        int target = 2;
        int ans = find_target(hours, target);
        System.out.println(ans);
    }
    static int find_target(int [] hours , int target){
        int count = 0;
        for(int i = 0; i <= hours.length-1;i++){
            if(hours[i]>=target){
                count++; 
            }
        }
        return count;
    }
}
