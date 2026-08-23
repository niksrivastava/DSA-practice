package DsaPatterns.TwoPointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(arr);
        System.out.println(ans);
    }
    public static int maxArea(int height[]){
        int i = 0;
        int j = height.length-1;
        int l = 0;
        int h = 0;
        int maxArea = -1;
        while (i<j) {
            
            if(height[i] < height[j]){
                l = j-i;
                h = height[i];
                i++;
            }
            else if(height[i] >= height[j]){
                l = j-i;
                h = height[j];
                j--;
            }

            int area = l*h;

            if(area > maxArea){
                maxArea = area;
            }

        }
        return maxArea;
    }
}
