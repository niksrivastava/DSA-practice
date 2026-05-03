package Super_Easy_Problems;

public class Xor_Operation_in_Arr {
    public static void main(String[] args) {
       int n = 5;
       int start = 0;
       System.out.println(XOR(n,start));
    }
    static int XOR(int n, int start){
        int[] arr = new int[n];
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (start+2*i);
            xor ^= arr[i];
        }
        return xor;
    }
}
