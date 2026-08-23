package DsaPatterns.TwoPointers;

public class StringCompression {
    public static void main(String[] args) {
        char chars[] = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int ans = compress(chars);
        System.out.println(ans);
    }
    public static int compress(char[] chars){

        int i = 0;
        int k = 0;

        while (i < chars.length) {

            int j = i;

            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }

            int count = j - i;

            chars[k++] = chars[i];

            if (count > 1) {

                String digits = String.valueOf(count);

                for (int n = 0; n < digits.length(); n++) {
                    chars[k++] = digits.charAt(n);
                }
            }

            i = j;
        }

        return k;
    }
}
