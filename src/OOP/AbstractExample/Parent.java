package OOP.AbstractExample;

public abstract class Parent {


    int age;
    final int VALUE;

    public Parent(int age){
        this.age = age;
        VALUE = 93273654;
    }
    

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
