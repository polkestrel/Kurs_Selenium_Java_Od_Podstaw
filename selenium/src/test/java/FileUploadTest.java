import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseSeleniumTest {

    @Test
    public void uploadFileTest() {
        driver.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\docs\\FileUpload.html");
        File path = new File("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\test274300900.png");
        driver.findElement(By.id("myFile")).sendKeys(path.getAbsolutePath());
    }
}
