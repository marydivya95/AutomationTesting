package AutomationTestingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class JavaScriptForLocators {
    @Test
    public void Locators() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='personTitle']")));
        //get count of dropdown
        int SizeOfdropdown = dropdown.getOptions().size();
        System.out.println(SizeOfdropdown);

        for (int i = 0; i < SizeOfdropdown; i++) {
            //get text of dropdowns
            String Text = dropdown.getOptions().get(i).getText();
            System.out.println(Text);

            if (Text.equalsIgnoreCase("Dr")) {
                dropdown.getOptions().get(i).click();
                break;
            }
        }
    }

             @Test
        public void DropDown()
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.harveynorman.com.au/samsung-galaxy-s20-fe-128gb-cloud-navy-2021.html");
          Select dropdowns= new Select(driver.findElement(By.name("options[999999900]")));

          int SizeOfIntrest=dropdowns.getOptions().size();
          System.out.println(SizeOfIntrest);

          for(int i=0; i<SizeOfIntrest;i++)
          {
              String dropdownTxn=dropdowns.getOptions().get(i).getText();
              System.out.println(dropdownTxn);
              if(dropdownTxn.equalsIgnoreCase("1 year Product Care Replacement" ))
              {
                  dropdowns.getOptions().get(i).click();
                  break;
              }



          }




        }




       /* List<WebElement> ListOfElements = dropdown.findElements(By.tagName("option"));
        System.out.println(ListOfElements.size());
        Select sca = new Select(dropdown);
        sca.selectByVisibleText("Dr");
       String s= dropdown.getAttribute("value");
       System.out.println(s);
        Assert.assertEquals("Dr",dropdown.getAttribute("value"));*/







      /*  for (int i = 0; i < ListOfElements.size(); i++) {
            String Text = ListOfElements.get(i).getText();
            System.out.println(Text);
            if(Text=="Dr")
            {
                Select sca = new Select(dropdown);
                sca.selectByVisibleText("Dr");
                break;
            }
        }*/
    }






