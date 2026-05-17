package Super_Easy_Problems;

public class First_Palindromic_String {
    public static void main(String[] args) {
        String [] words = {"def","ghi"};
        String ans = palin(words);
        System.out.println(ans);
    }
    static String palin(String[] words){
        
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str = words[i];
            int s = 0;
            int e = str.length()-1;
            boolean pal = true;
            while(s<e) {

                if(str.charAt(s) == str.charAt(e)){
                    s++;
                    e--;
                }
                else{
                    pal = false;
                    break;
                }
            }

            if(pal == true){
                return str;
            }
            str = "";

        }
        return str;

    }
}
