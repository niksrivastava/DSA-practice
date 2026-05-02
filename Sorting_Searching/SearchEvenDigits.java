

public class SearchEvenDigits {
    public static void main(String[] args) {
        
        int [] arr = {12, 345, 2, 6, 7896};
        
        
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            
            if (arr[i] <0){
                arr[i] = arr[i] * -1;
            }
            int count = 0;
            for(int digit = arr[i]; digit > 0; digit = digit/10){
                // digit = digit/10;
                count++;
                
            }
            if(count%2 == 0 && count != 0){
                    ans++; 
                }
        }
        System.out.println(ans);
  
    }
    
}
