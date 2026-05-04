package Arrays;
import java.util.*;
public class NamePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[6];
        for(int i = 0; i < name.length; i++){
            name[i] = sc.nextLine();
        }
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
    }
}
