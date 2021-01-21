package drivers;

public class WebDriverTest {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        chromeDriver.get();
        chromeDriver.findElementBy();

        firefoxDriver.get();
        firefoxDriver.findElementBy();
    }
}
