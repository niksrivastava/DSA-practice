package OOP.Properties.Polymorphism;

public class Circle extends Shapes{

//this will run when the obj of Circle is created
// hence it is overriding the parent classff
@Override// this is the annotation
    void area(){
        System.out.println("Area is pi * r* r");
    }
    
}
