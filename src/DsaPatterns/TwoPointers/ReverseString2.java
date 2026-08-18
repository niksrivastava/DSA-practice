package DsaPatterns.TwoPointers;

public class ReverseString2 {
    public static void main(String[] args) {
        String s = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
        int k = 8;
        String ans = revString(s, k);
        System.out.println(ans);
    }
    public static String revString(String s, int k){

        char[] arr = s.toCharArray();
        int i = 0;
        int j = Math.min(i+k-1, arr.length-1);

        while(i < arr.length){
            int n = i;
            int m = j; 

            while(n<m){
                swap(arr, n++, m--);
            } 
    
            i = 2*k + i;
            j = Math.min(i+k-1, arr.length-1);
            
        }


        s = new String(arr);

        return s;
    }

    public static void swap(char[] arr, int i, int j){
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
