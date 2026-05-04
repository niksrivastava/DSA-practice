package Arrays;
public class Extreme_element_in_an_alternate_manner {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        alternate_element(arr);
        // System.out.println(Arrays.toString(arr));
    }
    static void alternate_element(int[] arr){
        int s = 0;
        int n = arr.length-1;
        int e = n;
        while(s<=e){
            if(s==e){
             System.out.println(arr[s]);
            break;   
            }
            else{
                System.out.println(arr[s]);
                s++;
                System.out.println(arr[e]);
                e--; 
            }
            
        }
    }
}
