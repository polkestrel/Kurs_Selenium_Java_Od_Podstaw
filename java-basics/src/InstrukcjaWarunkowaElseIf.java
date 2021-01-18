public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        int number = 2;

        if (number == 0) {
            System.out.println("Liczba równa zero.");
        } else if (number> 0) {
            System.out.println("Liczba dodatnia.");
        } else if (number < -5) {
            System.out.println("Liczba mniejsz od -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}
