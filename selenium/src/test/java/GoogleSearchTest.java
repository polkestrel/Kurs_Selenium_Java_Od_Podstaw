import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseSeleniumTest {

    @FindBy(name = "q")
    private WebElement searchInput;

    @Test
    public void googleSearchTest() {
        SeleniumHelper helper = new SeleniumHelper(driver);
        PageFactory.initElements(driver,this);
        driver.get("https://www.google.com/");
        driver.switchTo().frame(0);
        WebElement acceptCookiesButtonGoogle = driver.findElement(By.xpath("//html/body/div/c-wiz/div/div/div/div/div/div[2]/form/div/span/span"));
        acceptCookiesButtonGoogle.click();
        searchInput.sendKeys("Selenium");
        helper.takeScreenshot();
        searchInput.sendKeys(Keys.ENTER);
        driver.findElement(By.partialLinkText("selenium")).click();
        helper.takeScreenshot();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}
