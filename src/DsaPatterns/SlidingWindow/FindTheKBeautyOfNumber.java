package DsaPatterns.SlidingWindow;

public class FindTheKBeautyOfNumber {
    public static void main(String[] args) {
        int num = 430043;
        int k = 2;
        int ans = kBeauty(num, k);
        int optimizedAns = optimizedKBeauty(num, k);
        System.out.println(ans);
        System.out.println(optimizedAns);
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
    public static int optimizedKBeauty(int num, int k){
        int beauty = 0;
        String s = String.valueOf(num);
        int low = 0;
        int high = k -1;

        while(high < s.length()){

            String divisor = s.substring(low, low + k);
            int div = Integer.parseInt(divisor);

            if(div != 0 && num%div == 0){
                beauty++;
            }

            low++;
            high++;
        } 
        return beauty;
    }
}


