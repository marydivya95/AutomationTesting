package AutomationTestingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BackForwardNav {

    @Test
    public void backwForw()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      WebElement butn= driver.findElement((By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='RNmpXc']")));
    String  butntxt= butn.getText();

   //   if (butntxt.equalsIgnoreCase("I'm Feeling Lucky"))
     // {
         butn.click();
         driver.navigate().back();
          driver.navigate().forward();
    //  }
       /* Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().getText();
        if(driver.switchTo().alert() != null)
        {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.dismiss(); // alert.accept();*/

        }
    }

