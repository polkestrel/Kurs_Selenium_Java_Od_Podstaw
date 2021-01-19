public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes", "Klasa S",2021,1000);
        System.out.println(mercedes.marka);
        System.out.println(mercedes.model);
        System.out.println(mercedes.rok);
        System.out.println(mercedes.przebieg);

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();



        Auto audi = new Auto("Audi","A5",2020,0);
        System.out.println(audi.marka);
        System.out.println(audi.model);
        System.out.println(audi.rok);
        System.out.println(audi.przebieg);

        audi.hamuj();
        audi.jedz();
        audi.info();


    }
}
