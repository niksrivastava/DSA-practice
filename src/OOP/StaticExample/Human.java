package OOP.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("hello world");
        // System.out.println(this.age); // can not use it over here becuz this keyword in non static and represent an obj and pointing to an obj.
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
