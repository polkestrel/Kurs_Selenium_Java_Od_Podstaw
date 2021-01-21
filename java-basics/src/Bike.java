import javax.swing.*;

public class Bike implements Vehicle {

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę rowerem z prędkością: " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuję rowerem. Naciskam mocno na pedały.");
    }

    @Override
    public String info() {
        return "Rower";
    }

    public void zatankuj() {
        System.out.println("Aby mieć siłę musisz zjesć obiad");
    }
}
