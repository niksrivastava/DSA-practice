public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int num = 10;
        String name = "Nikhil";
        System.out.println(name);

        String a = "Nik";
        System.out.println(a);
        // a = "Srivastava";
        // System.out.println(a);
        String b = "Nik";

        // ==
        System.out.println(a == b);

        String name1 = new String("nik");
        String name2 = new String("nik");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(1));

    }
}
