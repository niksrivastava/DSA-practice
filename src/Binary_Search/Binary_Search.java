package Binary_Search;
public class Binary_Search {
    static int binary_search(int arr[], int key){
        int start = 0;
        int end = arr.length -1;
        int mid = start + (end - start)/2;
        while( start <= end ){
            if(arr[mid]==key){
                return mid;
            }
            else if(key >= arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6, 2, 7, 4, 9, 1};
        int index_search = binary_search(arr, 9);

        System.out.println("Index of the key is " + index_search);
    }
}
