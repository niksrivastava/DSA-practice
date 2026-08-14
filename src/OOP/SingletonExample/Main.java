package OOP.SingletonExample;

import OOP.AccessModifier.A;

public class Main extends A{

    Main(int num, String name, int[] aar){
        super(num, name);
    }
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 variables will point to one single object

        A a = new A(5, "kunal");   
        a.getNum(); 
        // int n = a.num;
    }
    

}
