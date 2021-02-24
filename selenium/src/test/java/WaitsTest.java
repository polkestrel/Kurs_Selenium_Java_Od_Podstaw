import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitsTest extends BaseSeleniumTest {

    @Test
    public void waitTest() {
//        driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Waits.html");
        driver.findElement(By.tagName("button")).click();
        waitForWebElement(By.tagName("p"));
//        Thread.sleep(4000);
        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println(paragraph.getText());
        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
    }

    private void waitForWebElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 10L);
//        wait.pollingEvery(Duration.ofMillis(500));
//        wait.withTimeout(Duration.ofSeconds(10L));
//        wait.ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(driver1 ->  {
                System.out.println("Sprawdzam czy wyjątek jest wyświetlony");
                if (driver1.findElement(locator).isDisplayed()) {
                    System.out.println("Element jest wyświetlony");
                    return true;
                } else {
                    System.out.println("Element nie jest wyświetlony");
                    return false;
                }
            }
        );
    }
}
