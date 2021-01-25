import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        WebElement firstNameInput = driver.findElement(By.name("fname"));
        WebElement w3schoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement googleLink = driver.findElement(By.partialLinkText("Weird"));
        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));
        WebElement firstLink = driver.findElement(By.tagName("a"));

    }
}
