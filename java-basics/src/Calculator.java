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

        CalculatorTest calculator = new CalculatorTest();

        System.out.println("Suma podanych liczb (czyli " + firstNumber + " + " + secondNumber + ") wynosi: " + calculator.summation(firstNumber,secondNumber));
        System.out.println("Różnica podanych liczb (czyli " + firstNumber + " - " + secondNumber + ") wynosi: " + calculator.subtraction(firstNumber,secondNumber));
        System.out.println("Iloraz podanych liczb (czyli " + firstNumber + " / " + secondNumber + ") wynosi: " + calculator.division(firstNumber,secondNumber));
        System.out.println("Iloczyn podanych liczb (czyli " + firstNumber + " * " + secondNumber + ") wynosi: " + calculator.mulltiplication(firstNumber,secondNumber));
        System.out.println("Reszta z dzielenia podanych liczb (czyli " + firstNumber + " % " + secondNumber + ") wynosi: " + calculator.mod(firstNumber,secondNumber));
        System.out.println("Dzięki! To na razie tyle.");
    }
}