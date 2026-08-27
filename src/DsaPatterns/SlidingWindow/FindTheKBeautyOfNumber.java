package DsaPatterns.SlidingWindow;

public class FindTheKBeautyOfNumber {
    public static void main(String[] args) {
        int num = 430043;
        int k = 2;
        int ans = kBeauty(num, k);
        System.out.println(ans);
    }

    public static int kBeauty(int num, int k){
        int beauty = 0;
        String s = String.valueOf(num);
        int low = 0;
        int high = k -1;

        while(high < s.length()){
            String divisor = "";
            for(int i = low; i <= high; i++) {
                divisor += s.charAt(i);
            }
            int div = Integer.parseInt(divisor);

            try{
                if(num%div == 0){
                beauty++;
                }
            }catch(Exception e){}
            
            low++;
            high++;
        } 
        return beauty;
    }
}


