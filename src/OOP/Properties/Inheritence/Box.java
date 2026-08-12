package OOP.Properties.Inheritence;

public class Box {

    double l;
    double w;
    double h;
    
    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // rectangle
    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;

    }

    // square
    Box(double size){
        this.l = size;
         this.h = size;
         this.w = size;
    }

    public void info(){
        System.out.println("This box is running");
    }
}
