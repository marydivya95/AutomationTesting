package AutomationTestingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Radiobuttons {
    @Test
    public void Radiobuttons() {
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // we took similar webelements into a list
        List<WebElement> tr = driver.findElements((By.xpath("//table/tbody/tr/td[@class='table8']")));
        int trcount = tr.size();
        System.out.println(trcount);
        List<WebElement> td = driver.findElements((By.xpath("//table/tbody/tr/td/input[@name='radio1']")));
        int tdcount = td.size();
       System.out.println(tdcount);


        for(int i=0;i<trcount;i++)
        {
            String txt=tr.get(i).getText();
            System.out.println(txt);
             if(txt.equalsIgnoreCase("EXAMPLE"))
            {

               for(int j=0;j<tdcount;j++)
               {
                 String value=td.get(j).getAttribute("name");
                 if(value.equalsIgnoreCase("radio1"))
                 {
                     td.get(j).click();
                     break;
                 }

                 //  break;
              }


            }

        }

    }
}
