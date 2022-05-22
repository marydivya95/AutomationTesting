package AutomationTestingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
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
   public void ScreenShot() throws IOException {
       File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFileToDirectory(screenshotFile, new File("C:\\Users\\divya\\screenshot.png"));
      // File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      // FileUtils.copyFile(Screenshot,new File("C:\\Users\\username\\screenshot.png"));

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
