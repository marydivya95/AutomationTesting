package AutomationTestingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertExample {
    WebDriver driver;
    @Test
    public void alert() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //Intializing Chrome driver
        driver = new ChromeDriver();
        //max the screen
        driver.manage().window().maximize();
        //calling google page
        driver.get("https://www.harveynorman.com.au/");
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");


        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        ;
       // Alert.switchTo().alert();


        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
       // alert.accept();
    }
}

