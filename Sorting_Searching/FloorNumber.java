

public class FloorNumber {
    public static void main(String[] args) {
    int [] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 11;
        int Floor = search(arr, target);
        System.out.println(arr[Floor]); 

    }
    static int search(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;
        for(; s <= e;){
            int m = s + (e-s)/2;
            if(arr[m] == target){
                return m;
            }else if(target > arr[m]){
                s = m +1;
            }else{
                e = m - 1;
            }
            
        }
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] < target){
        //         return arr[i];
        //     }
        //     break;
        // }
        return e;
        
    }
}

