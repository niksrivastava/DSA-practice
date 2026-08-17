package OOP.Interfaces.Introduction;

import javax.security.auth.callback.NameCallback;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();

        // car.acc();
        // car.brake();
        // car.start();
        // car.stop();

        // Media carMedia = new Car();
        // carMedia.stop();

        NiceCar car = new NiceCar();

        car.engineStart();
        car.engineStop();
        car.startMusic();
        car.engineUpgrade();
        car.engineStart();

    }
}
