public class ForLoop {

    public static void main(String[] args) {

        int number = 100;

        for (int i = 0; i < number; i=i+2) {
            System.out.println(i);
        }

        for (int i=0; i < number; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        for (int k=0; k < number; k=k+10) {
            System.out.println(k);
        }

        for (int sth=0; sth < 300; sth++) {
            System.out.println("Będę robił pracę domową");
        }
    }
}
