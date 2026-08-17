package OOP.Interfaces.Introduction;

public class NiceCar {
    private Engine engine;
    private Media media = new CDPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void engineStart(){
        engine.start();
    }

    public void engineStop(){
        engine.stop();
    }

    public void startMusic(){
        media.start();
    }

    public void stopMusic(){
        media.stop();
    }

    public void engineUpgrade(){
        this.engine = new ElectricEngine();
    }
}
