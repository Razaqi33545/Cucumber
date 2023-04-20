package Utils;

import StepDefinitions.PageInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class CommonMethods extends PageInitializer {
    /*
    As the launching and closing of browser are common methods for all test cases even if we have 100s of them we create this class
    to have those common methods in this Utils package and CommonMethods class. We have created the Constants class and as it is static
    we can call it into CommonMethods so if we need to change the Constants then will not be doing it for every single test case
    to avoid repetition.
     */
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication() {

        ConfigReader.readProperties(); // This has come from Config reader class to avoid null pointer exception

        String browserType = ConfigReader.getPropertyValue("browserType");

        switch (browserType){

            case "Chrome":
                driver = new ChromeDriver();
                break;

            case "Firefox":
                driver = new FirefoxDriver();
                break;

            case "IE":
                driver = new InternetExplorerDriver();
                break;

            default: driver = new EdgeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.WAIT_TIME));
        initializePageObjects(); // This will initialize all the pages we have in our page PageInitializer along with the launching of application.
    }

    public static void closeBrowser(){
        driver.close();
    }


    public static void doClick(WebElement element){
        element.click();     /* We can add the wait time method here so whenever it clicks it will wait for the time
                            we give and will not be using those time waits repetitively we learned before. It will be
                            method inside method or nested method */
    }


    public static void sendText(WebElement element , String text){
       element.clear();
       element.sendKeys(text);
    }

    public static Select clickOnDropdown(WebElement element){
        Select select = new Select(element);
        return select;
    }

    public static void selectByValue(WebElement element , String value){
        clickOnDropdown(element).selectByValue(value);
    }

    public static void selectByVisibleText(WebElement element , String text){
        clickOnDropdown(element).selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement element , int index){
        clickOnDropdown(element).selectByIndex(index);
    }

    public static void selectByOption(WebElement element, String text){
      List<WebElement> options = clickOnDropdown(element).getOptions();
      for (WebElement option : options){
          String ddlOptionText = option.getText();
          if (ddlOptionText.equals(text)){
              option.click();
          }
      }
    }


}
