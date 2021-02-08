import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AnotherSeleniumTests {

    protected WebDriver driver;

//    @BeforeTest
//    public void setUp() {
//        System.out.println("Przed klasą");
//        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

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
        System.out.println("Wartość to: " + firstNameInput.getAttribute("value"));
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

    @Test
    public void znajdowanieTekstuElementuKtoryJestUkryty() throws InterruptedException {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");
        WebElement paragraph = driver.findElement(By.className("topSecret"));
        System.out.println("Mój tekst to: " + paragraph.getText());
        System.out.println("Mój tekst to: " + paragraph.getAttribute("value"));
        System.out.println("Mój tekst to: " + paragraph.getAttribute("textContent"));
    }

    @Test
    public void sprawdzanieCzyObrazekZaladowalSiePrawidlowo() throws InterruptedException {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");
        WebElement smileImg = driver.findElement(By.id("smileImage"));
        System.out.println(smileImg.getAttribute("naturalHeight"));
        System.out.println(smileImg.getSize().getHeight());
        System.out.println(smileImg.getSize().getWidth());
    }

    @Test
    public void sprawdzanieCzyElementJestEdytowalny() throws InterruptedException {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");
        WebElement firstNameInput = driver.findElement(By.name("fname"));
        if (firstNameInput.isEnabled()) {
            System.out.println("Element nie jest zablokowany do edycji dla użytkownika");
            firstNameInput.sendKeys("Tomek");
        } else {
            System.out.println("Element jest zablokowany");
        }
    }

    @Test
    public void sprawdzanieCzyCheckboxZostalZaznaczony() throws InterruptedException {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if (checkbox.isSelected()) {
            System.out.println("Checkbox jest zaznaczony");
            checkbox.click();
            System.out.println("Chceckbox został odznaczony");
        } else {
            System.out.println("Checkbox nie jest zaznaczony");
        }
    }

    @Test
    public void sprawdzanieCzyElementJestWyswietlonyNaStronie() throws InterruptedException {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");

        WebElement topSecretElement = driver.findElement(By.className("topSecret"));
        if (topSecretElement.isDisplayed()) {
            System.out.println("Element jest widoczny");
            System.out.println(topSecretElement.getText());
            //topSecretElement.click();
        } else {
            System.out.println("Element nie jest widoczny");
            System.out.println(topSecretElement.getAttribute("textContent"));
        }
    }

    @Test
    public void sprawdzanieCzyElementIstniejeNaStronie() throws InterruptedException {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");

        checkIfElementExist(By.tagName("a"), driver);
        checkIfElementExist(By.tagName("aaaaaa"), driver);

        checkIfElementExist(driver, By.tagName("a"));
        checkIfElementExist(driver, By.tagName("aaaaaaa"));
    }

    public boolean checkIfElementExist(By locator, WebDriver driver) {
        if (driver.findElements(locator).size() > 0) {
            System.out.println("Element istnieje na stronie");
            return true;
        }
        System.out.println("Element nie istnieje na stronie");
        return false;
    }

    public void checkIfElementExist(WebDriver driver, By locator) {
        try {
            driver.findElements(locator);
            System.out.println("Element istnieje na stronie");
        } catch (NoSuchElementException exc) {
            System.out.println("Element nie istnieje");
        }
    }

    @Test
    public void przelaczanieMiedzyOknamiPrzegladarki() throws InterruptedException {
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\Test.html");

        WebElement newPageButton = driver.findElement(By.id("newPage"));
        String currentWindowName = driver.getWindowHandle();
        newPageButton.click();
        switchToNewWindow(driver, currentWindowName);
        System.out.println("Tytuł strony to: " + driver.getTitle());
        System.out.println("Obecny URL to: " + driver.getCurrentUrl());
        driver.switchTo().window(currentWindowName);
        driver.findElement(By.name("username")).sendKeys(" Mouse");
    }

    private void switchToNewWindow(WebDriver driver, String currentWindowName) {
        System.out.println("Wartość dla obecnego okna to: " + currentWindowName);
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Ilość okien przeglądarki to: " + windows.size());
        for (String window : windows) {
            if (window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }
        }
    }

    @Test
    public void testPrzegladarkiGoogle() throws InterruptedException {
        System.out.println("Przed klasą");
        String driverPath = "C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        //przełaczenie sie do okienka z akceptowaniem ciastaeczek i naciśnięcie przycisku
        driver.switchTo().frame(0);
        WebElement acceptCookiesButton = driver.findElement(By.xpath("//html/body/div/c-wiz/div/div/div/div/div/div[2]/form/div/span/span"));
        acceptCookiesButton.click();

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.partialLinkText("selenium.dev"));
        seleniumPageLink.click();

        String expectedTitle = "SeleniumHQ Browser Automation";
        System.out.println(driver.getTitle());

        Assert.assertEquals(expectedTitle, driver.getTitle());
        Assert.assertTrue(expectedTitle.equals((driver.getTitle())));
        Assert.assertTrue("Tytuły nie są równe", driver.getTitle().equals("Zła nazwa"));

        driver.quit();

    }


//    @AfterTest
//    public void tearDown() {
//        System.out.println("Wykonuje sie po klasie");
//        driver.quit();
//    }
}
