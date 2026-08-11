package OOP.Introduction;

public class Main {
    public static void main(String[] args) {

        // creating class 
        Student[] student1 = new Student[5];

        System.out.println(student1);

        // just declaring reference variable of Student
        Student kunal;

        // dynamically allocating object of class Student in java
        kunal = new Student();

        // kunal.rno = 58;
        // kunal.marks = 99f;
        // kunal.name = "Kunal";

        // kunal.changeName("Coder");
        // kunal.greeting();


        System.out.println(kunal.rno);
        System.out.println(kunal.marks);
        System.out.println(kunal.name);

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "something something";
        System.out.println(two.name);
    }
}

// creating class for every single Student 
class Student{
    int rno;
    float marks = 80f;
    String name;

    // we need a way to add the values of the above properties object by object
    // so we need one word to access every object which is "this" key word

    void changeName (String newName){
        this.name = newName;
    }

    void greeting(){
        System.out.println("my name is " + name);
    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // Student (){
    //     this.rno = 56;
    //     this.marks = 89f;
    //     this.name = "Kunal kushwaha";
    // }

    Student (){

        // this is how you call a constructor from another constructor
        //internally: new Student(34, "anku", 67);
        this (34, "anku", 67);

    }

    // Studen arpit = new Student(12, arpit, 67);
    // here "this" will be replaced with arpit
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
