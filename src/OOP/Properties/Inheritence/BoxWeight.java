package OOP.Properties.Inheritence;

public class BoxWeight extends Box {

    double weight;

    // @Override
    // static void greeting(){// error becuz oe=verriding depends on object and static stuffs does not depend on object. hence you can't override it.
    //     System.out.println("I am in BoxWeight class");
    // }

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight){

        //what is super?
        super(l,w,h);// calls the parent class constructor and used to initialize values present in parent class.

        // System.out.println(super.weight);

        this.weight = weight;
    }

}
