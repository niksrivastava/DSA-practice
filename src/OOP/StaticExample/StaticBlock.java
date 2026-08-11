package OOP.StaticExample;


// this is a demo to show the initialization of static variables.
public class StaticBlock {

    static int a = 4;
    static int b;

    // will run only once, when the first object is created i.e. the class will be loaded for the first time.
    static{
        System.out.println("i am in static block");
        b = 5 * a;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }
}
