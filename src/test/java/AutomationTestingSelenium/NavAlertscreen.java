package AutomationTestingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.util.concurrent.TimeUnit;

public class NavAlertscreen {
    @Test
    public void Navigate() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.harveynorman.com.au/");
        String Title = driver.getTitle();
        System.out.println(Title);
        String Expected = "Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia\n";
        String Actual = Title;
        Assert.assertEquals(Expected, Actual);
        driver.quit();
    }

    @Test
    public void Locators() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.harveynorman.com.au/");
       WebElement element= driver.findElement(By.linkText("Sitemap"));
       JavascriptExecutor jse= (JavascriptExecutor)driver;
       jse.executeScript("arguments[0].scrollIntoView()",element);
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       element.click();

    }

    @Test
    public void NavigateToLoginTomyScreen() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.harveynorman.com.au/");
        driver.findElement(By.linkText("Account")).click();
// how to handle captcha
        String Text = driver.findElement(By.xpath("//h1[@class=\"page-heading cfx\"][contains(text(),'Log in to my account')]")).getText();
        System.out.println(Text);
        driver.quit();


    }
}

