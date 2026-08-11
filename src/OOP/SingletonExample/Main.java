package OOP.SingletonExample;

public class Main {
    Singleton obj = Singleton.getInstance();

    Singleton obj2 = Singleton.getInstance();

    Singleton obj3 = Singleton.getInstance();

    // all 3 variables will point to one single object

}
