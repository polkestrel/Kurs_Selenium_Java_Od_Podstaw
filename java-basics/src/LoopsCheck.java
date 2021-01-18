public class LoopsCheck {

    public static void main(String[] args) {

        int number = 100;
        int[] tablica = new int[] {1,3,5};


        // wypisanie liczb od 1 do 100 podzielnych przez 3
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // odwracanie wyświetlania elementów tablicy
        for (int i = (tablica.length - 1); i>=0; i--) {
            System.out.println(tablica[i]);
        }
    }
}
