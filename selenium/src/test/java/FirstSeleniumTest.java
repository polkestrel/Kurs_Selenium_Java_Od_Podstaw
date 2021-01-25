import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        Dimension dimension = new Dimension(1900,800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(dimension);
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");
        driver.findElement(By.id("newPage")).click();
        driver.quit(); // zamuka wszystkie okna
        //driver.close(); // zamyka pierwotne okno
    }
}
