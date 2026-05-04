package Arrays;

public class SwapAlternate {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i+=2){
                if(i+ 1 < arr.length){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
