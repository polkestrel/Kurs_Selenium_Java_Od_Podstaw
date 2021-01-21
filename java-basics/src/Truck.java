import javax.swing.*;

public class Truck implements Vehicle {

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę ciężarowką z prędkościa: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuję ciężarówką!");
    }

    @Override
    public String info() {
        return "Ciężarówka";
    }
}
