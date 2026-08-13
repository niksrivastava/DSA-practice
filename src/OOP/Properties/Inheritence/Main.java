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

        Box box5 = new BoxWeight(2, 4, 6, 1);
        System.out.println(box5.w);


        // there are many variables in both parent and child classes
        // and you are given access to variables that are in the ref type i.e. BoxWieght
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialized
        // but here, when the obj itself is of type parent class , how wil you call the constructor of the child class
        //this is why error
        // BoxWeight box6 = new Box(2, 5, 1);
        // System.out.println(box6);


    }
}
