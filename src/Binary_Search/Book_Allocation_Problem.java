package Binary_Search;
public class Book_Allocation_Problem {
    public static void main(String[] args) {
        int[] arr_of_book_page = {10, 20, 30, 40};
        int search = bi_search(arr_of_book_page, 2 );
        System.out.println(search);

    }

    static int bi_search(int[] arr, int m){
        int s = 0;
        int sum = 0;
        for(int i = 0; i<=arr.length-1; i++){
            sum+=arr[i];
        }
        int e = sum;
        int mid = s + (e-s)/2;
        int ans = -1;
        while(s<=e){
            if(is_possible(arr,m,mid)==true){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid+1;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }

    static boolean is_possible(int[] arr, int m, int mid){
        int student_count = 1;
        int page_count = 0;
        for(int i = 0; i<=arr.length-1; i++){
            if(page_count+arr[i]<=mid){
                page_count += arr[i];
            }
            else{
                student_count++;
                if(student_count>m || arr[i]>mid){
                    return false;
                }
            
            page_count = arr[i];
            }
        }
        return true;
    }
}

