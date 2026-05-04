package String_And_StringBuilder;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // integer will be convertedd to Integer that will call toString()

        System.out.println("Nikhil" + new ArrayList<>());
        System.out.println("Nikhil" + new Integer(56));

        // System.out.println(new ArrayList<>() + new Integer(56));....Giving error here because none of the obj is String, it will work if one of them whill be string as shown in the next line.
        String ans = new ArrayList<>() + "" + new Integer(56);
        System.out.println(ans);
        
    }
}
