import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");
        // WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        WebElement firstNameInput = driver.findElement(By.name("fname"));
        WebElement w3schoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement googleLink = driver.findElement(By.partialLinkText("Weird"));
        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));
        WebElement firstLink = driver.findElement(By.tagName("a"));

        WebElement clickOnMeButton = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement links = driver.findElement(By.cssSelector("a"));
        WebElement topSecretCss = driver.findElement(By.cssSelector(".topSecret"));
        WebElement tdFirstChild = driver.findElement(By.cssSelector("td:first-child"));

        WebElement clickOnMeXpathButton = driver.findElement(By.xpath("/html/body/button"));
        WebElement clickOnMeXpathButton2 = driver.findElement(By.xpath("//button"));
        WebElement linksXpath = driver.findElement(By.xpath("//a"));
        WebElement topSecretXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
        //WebElement topSecretXpath2 = driver.findElement(By.xpath("//[@class='topSecret']"));
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));


        List<WebElement> links2 = driver.findElements(By.tagName("a"));
        if (links2.size()>0) {
            System.out.println("Linki istnieją");
        } else {
            System.out.println("Linki nie istnieją");
        }
    }
}
