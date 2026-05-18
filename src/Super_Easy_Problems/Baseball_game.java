package Super_Easy_Problems;

public class Baseball_game {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        int ans = score(ops);
        System.out.println(ans);
    }
    static int score(String[] ops){
        int []arr = new int[ops.length];
        int k = 0;

        for (int i = 0; i < ops.length; i++) {

            if(ops[i].equals("C")){
                arr[k-1] = 0;
                k--;
            }
            else if(ops[i].equals("D")){
                arr[k] = 2*arr[k-1];
                k++;
            }
            else if(ops[i].equals("+")){
                arr[k] = arr[k-1]+arr[k-2];
                k++;
            }
            else{
                int value = Integer.parseInt(ops[i]);
                arr[k] = value;
                k++;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
