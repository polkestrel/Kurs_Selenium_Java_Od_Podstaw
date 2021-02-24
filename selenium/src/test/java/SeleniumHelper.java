import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;

public class SeleniumHelper {

    private WebDriver driver;

    public SeleniumHelper(WebDriver newDriver) {
        this.driver = newDriver;
    }

    public void takeScreenshot() {
        try {
            TakesScreenshot screenshooter = (TakesScreenshot) driver;
            File screenshot = screenshooter.getScreenshotAs(OutputType.FILE);
            Files.copy(screenshot.toPath(), Paths.get("C:\\SelfLearning\\Udemy\\Kurs Selenium od podstaw\\Selenium-course\\selenium\\src\\main\\resources\\executables\\drivers\\test" + LocalTime.now().getNano() + ".png"));
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku");
        }
    }
}
