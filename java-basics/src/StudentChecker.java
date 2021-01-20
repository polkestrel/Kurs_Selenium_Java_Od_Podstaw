public class StudentChecker {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();

        firstStudent.email = "ab@gazeta.ppl";
        firstStudent.numerIndeksu = 1588456;
        firstStudent.nick = "abraka";
        firstStudent.nazwisko = "Zwis";
        firstStudent.imie = "Major";
        firstStudent.infoUczelnia();

        secondStudent.email = "abfr@hg.de";
        secondStudent.numerIndeksu = 1258;
        secondStudent.nick = "Lolol";
        secondStudent.nazwisko = "Pusty";
        secondStudent.imie = "Franek";

        thirdStudent.email = "hamuj@gg.pl";
        thirdStudent.numerIndeksu = 12258;
        thirdStudent.nick = "Nieeee";
        thirdStudent.nazwisko = "PRom";
        thirdStudent.imie = "Antek";

        Student[] listStudentow = new Student[] {firstStudent,secondStudent,thirdStudent};
        for (int i = 0; i<= (listStudentow.length-1);i++) {
            listStudentow[i].podajEmail();
            listStudentow[i].podajNrIndeksu();
            listStudentow[i].przedstawSie();
            listStudentow[i].zalogujSie();
        }
    }
}
