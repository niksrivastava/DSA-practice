package Arrays;

import java.io.*;
import java.util.Scanner;

public class TCS_array_input_when_scanner_class_not_working {
    public static void main(String[] args) throws IOException {

        // -- input using buffered reader when scanner class not working...

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // try{
            int a = Integer.parseInt(br.readLine());
            double b = Double.parseDouble(br.readLine());
            byte c = Byte.parseByte(br.readLine());
            boolean d = Boolean.parseBoolean(br.readLine());
            String  name = br.readLine();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(name);
        // }
        // catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        // whenever we take input of any number and then afterwards,
        // we take input of string then java compiler considers
        // the extra space as a String and does not print anything
        // after printing anything so we need to write sc.nextLine();
        // so that java compiler print it correctly...
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(n + " " + s);
        sc.close();
    }
}
