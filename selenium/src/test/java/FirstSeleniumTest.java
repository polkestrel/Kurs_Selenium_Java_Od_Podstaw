import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
