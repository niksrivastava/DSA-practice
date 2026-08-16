package OOP.AbstractExample;

public class Daughter extends Parent{



    public Daughter(int age){
        super(age);
    }


    @Override
    void career(){
        System.out.println("I want to be a developer");
    }

    @Override
    void partner(){
        System.out.println("I love batman");
    }
}
