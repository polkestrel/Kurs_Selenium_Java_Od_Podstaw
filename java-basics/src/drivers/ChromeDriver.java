package drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę za pomocą przeglądarki: Chromedriver");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą przeglądarki: Chromedriver");
    }
}
