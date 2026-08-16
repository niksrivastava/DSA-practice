package DsaPatterns.TwoPointers;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,6};
        int arr2[] = {2,3,4,5};
        int ans = minCommonValue(arr1, arr2);
        System.out.println(ans);
    }
    public static int minCommonValue(int arr1[], int arr2[]){
        int ans = -1;

        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] != arr2[j]){
                if(arr1[i] > arr2[j]){
                    j++;
                }
                else{
                    i++;
                }
            }
            else{
                return arr1[i];
            }
        }





        return ans;
    }
}
