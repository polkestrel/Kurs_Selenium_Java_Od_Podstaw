public class Switch {

    public static void main(String[] args) {

        String danie = "Pizza";

        switch (danie) {
            case "Losos":
                System.out.println("Cena wynosi 22 pln");
                break;
            case "Pizza":
                System.out.println("Cena wynosi 15 pln");
                break;
            case "Frytki":
                System.out.println("Cena wynosi 150 pln");
                break;
            default:
                System.out.println("Brak takiego dania w karcie");
        }
    }
}
