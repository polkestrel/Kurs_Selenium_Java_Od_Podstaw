import java.util.Scanner;

public class Calculator {

//    private int firstNumber;
//    private int secondNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę...");
        float firstNumber = scanner.nextFloat();
        System.out.println("Teraz podaj drugą dowolną liczbę...");
        float secondNumber = scanner.nextFloat();
        float summation = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float division = firstNumber / secondNumber;
        float multiplication = firstNumber * secondNumber;
        float mod = firstNumber % secondNumber;
        System.out.println("Suma podanych liczb (czyli " + firstNumber + " + " + secondNumber + ") wynosi: " + summation);
        System.out.println("Różnica podanych liczb (czyli " + firstNumber + " - " + secondNumber + ") wynosi: " + subtraction);
        System.out.println("Iloraz podanych liczb (czyli " + firstNumber + " / " + secondNumber + ") wynosi: " + division);
        System.out.println("Iloczyn podanych liczb (czyli " + firstNumber + " * " + secondNumber + ") wynosi: " + multiplication);
        System.out.println("Reszta z dzielenia podanych liczb (czyli " + firstNumber + " % " + secondNumber + ") wynosi: " + mod);
        System.out.println("Dzięki! To na razie tyle.");
    }
}