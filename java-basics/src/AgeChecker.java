import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        float age = scanner.nextFloat();

        if (age >= 18) {
            System.out.println("Twój wiek to 18+, a to oznacza, że możesz kupić alkohol");
        } else if (age < 18 && age >= 0) {
            System.out.println("Masz poniżej 18 lat. Nie możesz kupic alkoholu");
        } else {
            System.out.println("Hej! Nie wygłupiaj się - podaj jeszcze raz swój wiek.");
        }
    }
}
