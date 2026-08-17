package OOP.Interfaces.ExtendInterfacesExample2;

public interface A {

    // static interface methods should alsways have a body.
    // call via the interface name
    static void greeting(){
        System.out.println("Hey, I am in a static method");
    }


    default void fun(){
        System.out.println("I am in A");
    }


}