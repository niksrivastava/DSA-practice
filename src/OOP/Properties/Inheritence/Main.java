package OOP.Properties.Inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(box1);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.w);

        BoxWeight box4 = new BoxWeight(2, 4, 6, 9);
        System.out.println(box4.w + " " + box4.weight);
    
    }
}
