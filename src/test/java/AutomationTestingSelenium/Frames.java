package AutomationTestingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Frames {
   WebDriver driver;
        @Before
        public void OpeningBrowser()
        {
            //Setup of chrome Driver It will get all the properties of chrome
            WebDriverManager.chromedriver().setup();
            //Intializing Chrome driver
            driver = new ChromeDriver();
            //max the screen
            driver.manage().window().maximize();
            //calling google page
            driver.get("https://www.harveynorman.com.au/signup");
            //Implicit Wait
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

    @Test
    public void frames() {


        List<WebElement> Frames=driver.findElements(By.tagName("iframe"));
        int TotalNoOfFrames=Frames.size();
        System.out.println(TotalNoOfFrames);
        for(int i=0;i<TotalNoOfFrames;i++)
        {
            driver.switchTo().frame(i);
           String afterswitchtxt= driver.findElement(By.xpath(" //h1[@class='heading'][contains(text(),'Sign up to our Newsletter')]")).getText();
          System.out.println(afterswitchtxt);
          String Expected ="Sign up to our Newsletter";
          String Actual=afterswitchtxt;
            Assert.assertEquals(Expected,Actual);
          if(afterswitchtxt.equalsIgnoreCase("Sign up to our Newsletter"))
          {
              driver.findElement(By.xpath("//input[@class='input-firstname']")).sendKeys("Divya");
               break;
          }
        }


    }
        @After
        public void CloseBrowse()
        {
            //driver will close curre nt browser instances
            driver.close();
            //driver will close allthe opened browser instances
            driver.quit();

        }


    }

