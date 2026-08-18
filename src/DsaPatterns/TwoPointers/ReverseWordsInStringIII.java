package DsaPatterns.TwoPointers;

public class ReverseWordsInStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = revStr3(s);
        System.out.println(ans);
    }

    public static String revStr3(String s) {
        int i = 0;
        int j = i+1;
        int k = 0;
        char [] arr = s.toCharArray();
        int n = arr.length;
        while(i < n && j < n){
            if(arr[j] == ' ' || j == n-1){
                if(j == n-1){
                    k = j;
                }
                else{
                    k = j;
                    j--;
                }

                while(i<j){
                    swap(arr, i++, j--);
                }

                i = k+1;
                j = i+1;

            }
            else if(arr[j] != ' '){
                j++;
            }
        }
        s = new String(arr);
        return s;
    }
    public static void swap(char [] arr, int a, int b){
        char t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
