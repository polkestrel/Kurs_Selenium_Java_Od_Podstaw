public class OperatoryMatematyczne {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0f;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber/secondNumber;
        float divisionFloat = thirdNumber/secondNumber;
        int mod = secondNumber % firstNumber;

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Dzielenie przy użyciu float: " + divisionFloat);
        System.out.println("Reszta z dzielenia: " + mod);

        firstNumber += secondNumber;
        System.out.println(firstNumber);
    }
}
