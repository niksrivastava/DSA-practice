package Arrays;

public class Max_product {
    public static void main(String[] args) {
        int [] nums = {0, 2};
        int ans = product(nums);
        System.out.println(ans);
    }
    static int product(int nums[]){

        int product = 1;
        int max_product = Integer.MIN_VALUE;
        

        for (int i = 0; i < nums.length; i++) {
           
            for (int j = i; j < nums.length; j++) {

                product *= nums[j];

                max_product = Math.max(product, max_product);
                
            }
            product = 1;
        }

        return max_product;

    }
    
}
