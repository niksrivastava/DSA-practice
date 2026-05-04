package String_And_StringBuilder;
import java.util.*; 
public class String_Basic {
    public static void main(String[] args) {
        // String FirstName = "Love";
        // String LastName = new String("Babbar");
        // System.out.println(FirstName+ " "+ LastName);

        // System.out.println(FirstName.length());
        // System.out.println(LastName.length());
        // System.out.println(FirstName.charAt(3));
        // System.out.println(LastName.charAt(5));

        // String name1 = "Nikhil";
        // String name2 = "NIKHIL";

        // // if(name1==name2){
        // //     System.out.println("Both are equal");
        // // }
        // // else{
        // //     System.out.println("Not equal");
        // // }

        // if(name1.equalsIgnoreCase(name2)){
        //     System.out.println("Both are equal");
        // }
        // else{
        //     System.out.println("not Equal");
        // }

        // String str = "  ";
        // System.out.println(str.length());
        // System.out.println(str.isEmpty());
        // System.out.println(str.isBlank());

        // String name = "   Nikhil  ";
        // System.out.println(name.length());

        // name = name.trim();
        // System.out.println(name.length());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        

        // String str = "My name is nikhil";
        // System.out.println(str.substring(3,7));

        // System.out.println(str.contains("nikhil"));

        // int num = 1234;
        // String str = String.valueOf(num);
        // System.out.println(num+1);
        // System.out.println(str+1);

        // String str = "Nikhil Kumar";
        // System.out.println(str.startsWith("N"));
        // System.out.println(str.startsWith("hey"));

        // System.out.println(str.endsWith("r"));
        // System.out.println(str.endsWith("kksna"));

        // String name = "Nikhil";
        // char[] chr = name.toCharArray();

        // // print the char array
        // for(char ch: chr){
        //     System.out.println("value of char: "+ ch);
        // }

        // String input = "My, name, is Nikhil, kumar";
        // String[] words = input.split(",");
        // for (String str : words) {
        //     System.out.println(str);
        // }

        // String name = "Nikhil";
        // name = name.replace('i','t');
        // System.out.println(name);

        String str = "Nikhil";
        printstring(str);
    

        
    }
    static void printstring(String str){
        
        int n = str.length();
        for (int i = 0; i < n; i++) {
            // char ch = str.charAt(i);
            // System.out.println(ch);
            System.out.println(str.charAt(i));
        }
    }
}
