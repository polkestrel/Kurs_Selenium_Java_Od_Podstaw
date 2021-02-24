import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseSeleniumTest {

    @Test
    public void googleSearchTest() {
        SeleniumHelper helper = new SeleniumHelper(driver);
        driver.get("https://www.google.com/");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        helper.takeScreenshot();
        searchInput.sendKeys(Keys.ENTER);
        driver.switchTo().frame(0);
        WebElement acceptCookiesButton = driver.findElement(By.xpath("//html/body/div/c-wiz/div/div/div/div/div/div[2]/form/div/span/span"));
        acceptCookiesButton.click();
        driver.findElement(By.partialLinkText("selenium")).click();
        helper.takeScreenshot();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}
