package String_And_StringBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        // int num = 10;
        // String name = "Nikhil";
        // System.out.println(name);

        // String a = "Nik";
        // System.out.println(a);
        // // a = "Srivastava";
        // // System.out.println(a);
        // String b = "Nik";

        // // ==
        // System.out.println(a == b);

        // String name1 = new String("nik");
        // String name2 = new String("nik");
        // System.out.println(name1 == name2);
        // System.out.println(name1.equals(name2));
        // System.out.println(name1.charAt(1));

        // float a = 23.725374f;
        // System.out.printf("%.2f", a);
        // System.out.println();
        // System.out.printf("%.2f", Math.PI);
        // System.out.println();
        // System.out.printf("hello my name is %s and I am learning %s", "Nikhil", "Strings in Java");

        // System.out.println('a' + 'b');
        // System.out.println("a" + "b");
        // System.out.println('a' + 3);
        // System.out.println((char)('a' + 3));
        // System.out.println("a" + 3);


        // System.out.println("Nikhil" + new ArrayList<>());

        // String series = "";
        //  for(int i = 0; i < 26; i++){
        //     char ch = (char)('a' + i);
        //     System.out.println(ch);
        //     series += ch;
        //  }

        //  System.out.println(series);

        // StringBuilder builder = new StringBuilder();

        // for (int i = 0; i < 26; i++) {
        //     char ch = (char)('a' + i);
        //     builder.append(ch);
        // }
        // System.out.println(builder);
        // builder.reverse();
        // System.out.println(builder);

        String name = "Nikhil kumar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf('g'));
        System.out.println(name.toUpperCase());
        System.out.println("Nikhil kumar".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
