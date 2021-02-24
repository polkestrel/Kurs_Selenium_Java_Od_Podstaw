import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AnnotationsTest extends BaseSeleniumTest {

//    @FindBys({
//            @FindBy(tagName = "table"),
//            @FindBy(className = "tableHeader")
//    })

    private List<WebElement> elements;

    @FindBy(xpath = "//input")
    private List<WebElement> inputs;

    @FindBy(xpath = "//button")
    private List<WebElement> buttons;

    @FindAll({
            @FindBy(xpath = "//button"),
            @FindBy(xpath = "//input")
    })
    private List<WebElement> inputsAndButtons;

    @Test
    public void googleSearchTest() {
        PageFactory.initElements(driver,this);
        driver.get("file:///C:/SelfLearning/Udemy/Kurs%20Selenium%20od%20podstaw/docs/Test.html");
        System.out.println("Inputs size is " + inputs.size());
        System.out.println("Buttons size is " + buttons.size());
        System.out.println("Inputs and buttons size is " + inputsAndButtons.size());
    }
}
