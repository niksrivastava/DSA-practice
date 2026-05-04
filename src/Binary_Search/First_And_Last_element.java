package Binary_Search;
public class First_And_Last_element {
    public static void main(String[] args) {
        int [] arr = {3, 4 , 5, 5, 5, 5, 6, 6, 8, 9};
        int leftsearch = bi_leftsearch(arr, 5);
        int rightsearch = bi_rightsearch(arr, 5);
        System.out.println("Left index is: " + leftsearch);
        System.out.print("Right index is: " + rightsearch);

    }
    static int bi_leftsearch(int[] arr, int key){
        int s = 0;
        int e = arr.length-1;
        int m = s + ( e - s)/ 2;
        int ans = -1;
        while (s <= e){
            if(key==arr[m]){
                ans = m;
                e = m - 1;
            }
            else if(key > arr[m]){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
            m = s + (e-s)/2;
        }
        return ans;
    }

    static int bi_rightsearch(int[] arr, int key){
        int s = 0;
        int e = arr.length-1;
        int m = s + ( e - s)/ 2;
        int ans = -1;
        while (s <= e){
            if(key==arr[m]){
                ans = m;
                s = m + 1;
            }
            else if(key > arr[m]){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
            m = s + (e-s)/2;
        }
        return ans;
    }
}
