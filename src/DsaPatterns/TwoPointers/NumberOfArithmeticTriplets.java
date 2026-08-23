package DsaPatterns.TwoPointers;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        int arr[] = {0,1,4,6,7,10};
        int diff = 3;
        int ans = triplets(arr, diff);
        System.out.println(ans);
    }
    public static int triplets(int arr[], int diff){
        int count = 0;

        int i = 0;
        int j = i+1;

        while(i < arr.length-2){
            while(j < arr.length-1){
                if(arr[j] - arr[i] == diff){
                    int k = arr.length-1;
                    while(j < k){
                        if(arr[k] - arr[j] == diff){
                            count++;
                            break;
                        }else{
                            k--;
                        }
                    }
                    break;
                }
                else{
                    j++;
                    }
                }
                i++;
                j = i+1;
            }
        return count;
    }
}
