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

public class Radiobuttons2 {
    @Test
    public void radio2() {
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

        List< WebElement> RadiobuttonsList =driver.findElements(By.xpath("//input[@type='radio']"));
        int Radiobuttoncount=RadiobuttonsList.size();
        System.out.println(Radiobuttoncount);
        for(int i=0;i<Radiobuttoncount;i++)
        {
            String buttonvalue=RadiobuttonsList.get(i).getAttribute("value");
            System.out.println(buttonvalue);


            if(buttonvalue.equalsIgnoreCase("Cheese"))
            {
                RadiobuttonsList.get(i).click();
                break;
            }
        }
    }
}