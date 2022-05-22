package AutomationTestingSelenium;

import LoopsConcept.Switch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandles {
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
    public void windowHandles()
    {
        //from harveynormaan website we are clicking on Customise me link at the botton
        WebElement Customise=driver.findElement(By.xpath("//a[contains(text(),'CustomiseMe')]"));

        //page is not scrolling to footermenu so by using javascriptexecutor we are clicking
        JavascriptExecutor  jse= (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView()",Customise);
        Customise.click();
       // System.out.println(driver.getTitle());
        //get current  window from browser
        String ParentWindow= driver.getWindowHandle();
        System.out.println(ParentWindow);
      System.out.println(driver.getTitle());  //getting parent title
        // command to get all opened windows
        Set<String> AllWindows=driver.getWindowHandles();
        System.out.println(AllWindows);
       // System.out.println(driver.getTitle());//child 1 title

       /* if(AllWindows.iterator().hasNext())
        {

           driver.switchTo().window(AllWindows.iterator().next());

          //  System.out.println(driver.getTitle());
        }*/




    }





   /* @After
    public void CloseBrowse() {
        //driver will close curre nt browser instances
        driver.close();
        //driver will close allthe opened browser instances
        driver.quit();

    }*/
}
