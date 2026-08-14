package OOP.AccessModifier;


public class SubClass extends A{  
    SubClass(int num, String name){
        super(num, name);
    }
    public static void main(String[] args) {
        SubClass obj =  new SubClass(0, null);
        int n= obj.num;
    }
}
