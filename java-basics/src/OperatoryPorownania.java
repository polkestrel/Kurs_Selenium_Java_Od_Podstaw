import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę...");
        float firstNumber = scanner.nextFloat();
        System.out.println("Teraz podaj drugą dowolną liczbę...");
        float secondNumber = scanner.nextFloat();

        boolean wieksze = firstNumber > secondNumber;
        boolean mniejsze = firstNumber < secondNumber;
        boolean wiekszeLubRowne = firstNumber >= secondNumber;
        boolean mniejszeLubRowne = firstNumber <= secondNumber;
        boolean jestRowne = firstNumber == secondNumber;
        boolean nieJestRowne = firstNumber != secondNumber;

        System.out.println("Czy " + firstNumber + " jest większe (>) od " + secondNumber + " ? Odpowiedź to: " + wieksze);
        System.out.println("Czy " + firstNumber + " jest mniejsze (<4,5) od " + secondNumber + " ? Odpowiedź to: " + mniejsze);
        System.out.println("Czy " + firstNumber + " jest wieksze lub równe (>=) " + secondNumber + " ? Odpowiedź to: " + wiekszeLubRowne);
        System.out.println("Czy " + firstNumber + " jest mniejsze lub równe (<=) " + secondNumber + " ? Odpowiedź to: " + mniejszeLubRowne);
        System.out.println("Czy " + firstNumber + " jest równe (==) " + secondNumber + " ? Odpowiedź to: " + jestRowne);
        System.out.println("Czy " + firstNumber + " nie jest równe (!=) " + secondNumber + " ? Odpowiedź to: " + nieJestRowne);
    }
}
