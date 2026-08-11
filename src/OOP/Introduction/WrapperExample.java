package OOP.Introduction;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10; 
        Integer b = 20;
        swap(a,b);

        // final int bonus = 5;
        // bonus = 7;// can't change becuz it final 

        final A kunal = new A("kunal");
        kunal.name = "nikhil";

        //when a non prmitive is final, you can not reassign it.
        // kunal = new A ("new obj");


        A obj = new A("hjsdbcbuiw");
        for (int i = 0; i < 100000000; i++) {
            obj = new A("random object");
        }

        System.out.println(obj);



    }
    public static void swap(Integer a, Integer b){
        Integer t = a;
        a = b;
        b = t;
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    protected void finalize() throws Throwable{
        System.out.println("object is destroyed");
    }
}
