

public class CeilingNumber {
    public static void main(String[] args) {
        int [] letters = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int Ceiling = search(letters, target);
        System.out.println(letters[Ceiling]); 

    }
    static int search(int [] letters, int target){
        if(letters.length == 0){
            return -1;
        }
        if(target > letters[letters.length - 1]){
            return letters[0];
        }
        int s = 0;
        int e = letters.length - 1;
        for(; s <= e;){
            int m = s + (e-s)/2;
            if(target > letters[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
            
        }
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] > target){
        //         return arr[i];
        //     }
        //     break;
        // }
        return letters[s];
    }
}
