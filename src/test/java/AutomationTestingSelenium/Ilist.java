package AutomationTestingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ilist {
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
        driver.get("https://www.google.com/");
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void LinksList()  {
        List<WebElement> listoflinks =driver.findElements(By.tagName("a"));

        int linkscount=listoflinks.size();
        System.out.println(linkscount);
        for(int i=0;i<linkscount;i++)
        {
            String LinkNames=listoflinks.get(i).getText().trim();
            if(LinkNames.equalsIgnoreCase("Gmail")){
                listoflinks.get(i).click();
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
