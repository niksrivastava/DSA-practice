package Super_Easy_Problems;

public class Max_achievable_num {
    public static void main(String[] args) {
        int num = 4;
        int t = 1;
        System.out.println(find_max(num,t));
    }
    static int find_max(int num, int t){
        return num+2*t;
    }
}
