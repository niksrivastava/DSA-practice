package OOP.Interfaces.Introduction;

public class PowerEngine implements Engine{

    @Override
    public void acc() {
        System.out.println(" power engine acc");
        
    }

    @Override
    public void start() {
        System.out.println("power engine start");
        
    }

    @Override
    public void stop() {
        System.out.println("power engine stop");
        
    }
    
}
