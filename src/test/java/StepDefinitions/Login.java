package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login extends CommonMethods {

     /*  @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
       openBrowserAndLaunchApplication();  This method has come from CommonMethods class.
        } Hooks Will take care of it */

    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        /* Once we put ConfigReader.getPropertyValue and then the value username the value username in the config.properties file will
       be highlighted in orange color.  */
        // driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getPropertyValue("username"));
       WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
       sendText(usernameTextBox , ConfigReader.getPropertyValue("username"));

        // driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropertyValue("password"));
       WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(passwordTextBox , ConfigReader.getPropertyValue("password"));
    }

    @When("click on login button")
    public void click_on_login_button() {
       WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        doClick(loginBtn); // We have created doClick generic method in CommonMethods and are using it repetitively.
    }

    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        boolean userloggedin = driver.findElement(By.id("welcome")). isDisplayed();
        if(userloggedin){
            System.out.println("User is logged in successfully");
        }
    }

  /*  @Then("close the browser")  Even if this method is written only in Login.feature test case if you add "Then close the browser"
   into the feature files of other test cases it will close the browser for all the other test cases mentioned in those files
    public void close_the_browser() {
        closeBrowser();
    } Hooks will take care of it */


    /* This is for regular expression functionality of cucumber for @smoke2 test case alternative way to Java Property files but
    use for small amount of test cases*/
    @When("user enters valid {string} and valid {string}")
    public void user_enters_valid_and_valid(String username, String password) {
        WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
        sendText(usernameTextBox, username);

        WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(passwordTextBox , password);
    }
}
