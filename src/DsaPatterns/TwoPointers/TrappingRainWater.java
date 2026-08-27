package DsaPatterns.TwoPointers;

public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {4,2,3};
        int ans = trap(arr);
        System.out.println(ans);
    }
    public static int trap(int arr[]){
        int ans = 0;


        for (int i = 0; i < arr.length; i++) {

            int leftMax = 0;
            
            
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, arr[j]);
            }
            
            int rightMax = 0;
            
            for (int j = i; j < arr.length; j++) {

                rightMax = Math.max(rightMax, arr[j]);
                
            }
            ans += Math.min(leftMax, rightMax) - arr[i];
        }

        return ans;

    }
}
