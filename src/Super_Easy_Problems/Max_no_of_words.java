package Super_Easy_Problems;

public class Max_no_of_words {
    public static void main(String[] args) {
        String[] str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans = word(str);
        System.out.println(ans);
    }
    static int word(String[] str){
        int word = 0;
        int count = 0;
        String sentence = "";
        for (int i = 0; i < str.length; i++) {
            sentence = str[i];
            count = (sentence.split(" ").length);
            word = Math.max(word, count);
            count = 0;
        }
        return word;
    }
}
