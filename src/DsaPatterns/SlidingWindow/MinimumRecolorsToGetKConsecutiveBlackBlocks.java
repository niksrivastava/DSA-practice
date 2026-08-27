package DsaPatterns.SlidingWindow;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {
        String block = "WBWBBBW";
        int k = 2;
        int ans = minRecolor(block, k);
        System.out.println(ans);
    }
    public static int minRecolor(String s, int k){
        
        int minRecolor = Integer.MAX_VALUE;
        int low = 0;
        int high = k-1;
        while(high<s.length()){
            int count = 0;
            for (int i = low; i <= high; i++) {
                if(s.charAt(i) != 'B'){
                    count++;
                }
            }
            minRecolor = Math.min(count, minRecolor);
            low++;
            high++;
        }
        return minRecolor;
    }
}
