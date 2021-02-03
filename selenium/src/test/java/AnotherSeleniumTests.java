import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherSeleniumTests {

    @Test
    public void pobieranieTekstuZElementu() throws InterruptedException {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Krzysztof");
        System.out.println("Wartość to: " + firstNameInput.getText());
        System.out.println("Wartość to: " +firstNameInput.getAttribute("value"));
        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println("Wartość dla label to: " + label.getText());
        driver.quit();
    }

    @Test
    public void checkBoxyAndRadioButtony() throws InterruptedException {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        Thread.sleep(1500);
        checkBox.click();
        Thread.sleep(1500);
        checkBox.click();

        WebElement radioButton = driver.findElement(By.xpath("//input[@value='male']"));
        radioButton.click();
    }
}
