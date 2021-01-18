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

        // odwrócenie tablicy
         for (int i=0; i<(tablica.length/2);i++) {
             int temp = tablica[i];
             tablica[i] = tablica[tablica.length-1-i];
             tablica[tablica.length-1-i] = temp;
             System.out.println("Iteracja numer: " + i);
         }
         for (int i =0; i < tablica.length;i++) {
             System.out.println(tablica[i]);
         }
    }
}
