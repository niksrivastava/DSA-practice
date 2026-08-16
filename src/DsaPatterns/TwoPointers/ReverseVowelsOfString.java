package DsaPatterns.TwoPointers;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String s = "IceCreAm";
        String ans = revVowels(s);
        System.out.println(ans);
    }
    public static String revVowels(String s){

        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){

            if(arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u' && arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U'){

                i++;

            }
            else if(arr[j] != 'a' && arr[j] != 'e' && arr[j] != 'i' && arr[j] != 'o' && arr[j] != 'u' && arr[j] != 'A' && arr[j] != 'E' && arr[j] != 'I' && arr[j] != 'O' && arr[j] != 'U'){

                j--;
                
            }
            else if((arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') && (arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u' || arr[j] == 'A' || arr[j] == 'E' || arr[j] == 'I' || arr[j] == 'O' || arr[j] == 'U')){
                swap(arr, i, j);
                i++;
                j--;
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
