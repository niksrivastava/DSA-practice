public class CountRotations {
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(count(arr));
        
    }
    static int count(int [] arr){
        int pivot = findpivot(arr);
        return pivot + 1;
    }
    //for non dublicate element element use this
    static int findpivot(int [] arr){
        int s = 0;
        int e = arr.length -1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(m < e && arr[m] > arr[m + 1]){
                return m;
            }
            if(m > s && arr[m] < arr[m - 1]){
                return m - 1;
            }
            if(arr[s] >= arr[m]){
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return -1;
    }}
//     //for dublicate  element use this
//     static int findpivot(int [] arr){
//         int s = 0;
//         int e = arr.length -1;
//         while(s <= e){
//             int m = s + (e - s)/2;
//             if(m < e && arr[m] > arr[m + 1]){
//                 return m;
//             }
//             if(m > s && arr[m] < arr[m - 1]){
//                 return m - 1;
//             }
//             if(arr[m] == arr[s] && arr[m] == arr[e]){
//                 if(s < e && arr[s] > arr[s + 1]){
//                     return s;
//                 }
//                 s++;
//             if( e > s && arr[e] < arr[e - 1]){
//                 return e - 1;
//             }
//                 e--;
//             }
//             else if(arr[s] < arr[m] || (arr[s] == arr[m] && arr[m] > arr[e])){
//                 s = m + 1;
//             }else{
//                 e = m - 1;
//             }
//         }
//         return -1;
//     }
// }
