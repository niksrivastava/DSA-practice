package OOP.StaticExample;

public class Main {

    public static void main(String[] args) {
        Human kunal = new Human(23, "kunal", 10000, false);

        Human rahul = new Human(34, "rahul", 12000, true);

        System.out.println(kunal.age);
        System.out.println(rahul.name);
        System.out.println(Human.population);
        System.out.println(Human.population);

        // Example
        // Main funn = new Main();// like this obj will be created inside main function automatically
        // funn.fun2();
        
        
    }

    static void fun(){
        // greeting(); // we can not use this becuz it require an instance.
        // but the function you are using it in does not depend on instance.


        // we cannot access non static stuff without referencing their instances in a static context
        // hence, here we are referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();// here we are call non static method inside non static method becuz we know, in the end obj for the non staic function will be created automatically in the main function 100%. Becuz everything goes inside main function only in the end.
    }

    // we can not use non-static method or anything which is non-static inside staic method.
    // means if greeting method will not staic method then we can't use it inside main method.
    // becuz we know that something which is not staic, belogs to an object.
    void greeting(){

        fun();// but non static function can be used inside non static methods.
        // becuz it does depend on any obj. (simple)

        System.out.println("hello world");
    }
}
