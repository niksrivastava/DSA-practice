package OOP.SingletonExample;

import OOP.AccessModifier.A;

public class SubClass extends A {
    SubClass(int num, String name){
        super(num, name);
    }
    public static void main(String[] args) {
        SubClass obj =  new SubClass(0, null);
        int n= obj.num;
    }
}

    class subsubclass extends SubClass{
        public subsubclass(int num, String name){
            super(num, name);
        }
        public static void main(String[] args) {
            subsubclass obj = new subsubclass(5, "sasd");
            int n = obj.num;

        }
    }

    class SubClass2 extends A{
        public SubClass2(int num, String name){
            super(num, name);
        }
    }

