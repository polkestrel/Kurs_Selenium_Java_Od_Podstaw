import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptExecution extends BaseSeleniumTest {

    @Test
    public void googleSearchTest() {
        driver.get("https://www.google.com/");
        driver.switchTo().frame(0);
        WebElement acceptCookiesButton = driver.findElement(By.xpath("//html/body/div/c-wiz/div/div/div/div/div/div[2]/form/div/span/span"));
        acceptCookiesButton.click();

        WebElement searchInput = driver.findElement(By.name("q"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Actions action = new Actions(driver);
        action.contextClick().build().perform();
        executor.executeScript("arguments[0].setAttribute('value', 'Selenium')", searchInput);
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumLink = driver.findElement(By.linkText("SeleniumHQ Browser Automation"));
        executor.executeScript("arguments[0].click();", seleniumLink);
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}
