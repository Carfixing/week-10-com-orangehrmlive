package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {
    public static void main(String[] args) {
        //store URL in String datatype
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        //set the property from chrome browser
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

        //creating object of web driver interface
        WebDriver driver = new FirefoxDriver();

        //launch the URL
        driver.get(baseUrl);

        //maximize the window
        driver.manage().window().maximize();

        //give the implicity time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //print the title of the page
        System.out.println("Title : " + driver.getTitle());

        //print the current URl
        System.out.println("Current URL is : " + driver.getCurrentUrl());

        //print the print source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter the email to email field
        WebElement emialField = driver.findElement(By.id("txtUsername"));
        emialField.sendKeys("Admin");

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("admin123");
        driver.close();

    }
}