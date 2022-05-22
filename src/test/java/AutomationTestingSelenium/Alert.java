package AutomationTestingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Alert {
    WebDriver driver;

    @Before
    public void OpeningBrowser() {
        //Setup of chrome Driver It will get all the properties of chrome
        WebDriverManager.chromedriver().setup();
        //Intializing Chrome driver
        driver = new ChromeDriver();
        //max the screen
        driver.manage().window().maximize();
        //calling google page
        driver.get("https://www.harveynorman.com.au/");
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void windowHandles() throws InterruptedException {
        //from harveynormaan website we are clicking on Customise me link at the botton
        WebElement Customise = driver.findElement(By.xpath("//a[contains(text(),'CustomiseMe')]"));

        //page is not scrolling to footermenu so by using javascriptexecutor we are clicking
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()", Customise);
        Customise.click();
        Thread.sleep(15000);;
       String alerttext= driver.switchTo().alert().getText();
       System.out.println(alerttext);
      //  if(driver.switchTo().alert().)
     //   {

         //   driver.switchTo().alert().accept();
       // }





    }
}
