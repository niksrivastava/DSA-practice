package OOP.Interfaces.NestedInterface;

public class A {

    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface /* A.NestedInterface --> this means inside A, there is NestedInterface*/ {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
    
}
