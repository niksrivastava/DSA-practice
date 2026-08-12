package OOP.Properties.Inheritence;

public class BoxWeight extends Box {

    double weight;
    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight){

        //what is super?
        super(l,w,h);// calls the parent class constructor and used to initialize values present in parent class.
        this.weight = weight;
    }
}
