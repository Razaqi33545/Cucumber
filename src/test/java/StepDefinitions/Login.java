package StepDefinitions;

import Pages.LoginPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;


public class Login extends CommonMethods {



    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
     //   LoginPage login = new LoginPage();
       sendText(login.usernameTextBox , ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextBox , ConfigReader.getPropertyValue("password"));
    }


    @When("click on login button")
    public void click_on_login_button() {
     //   LoginPage login = new LoginPage();
        doClick(login.loginBtn); // from CommonMethods.
    }


    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        boolean userloggedin = driver.findElement(By.id("welcome")). isDisplayed();
        if(userloggedin){
            System.out.println("User is logged in successfully");
        }
    }


    /* This is for regular expression functionality of cucumber for @smoke2 test case and Scenario Outline
    alternative way to Java Property files but used for small amount of test cases */
    @When("user enters valid {string} and valid {string}")
    public void user_enters_valid_and_valid(String username, String password) {
      //  LoginPage login = new LoginPage();
        sendText(login.usernameTextBox, username);
        sendText(login.passwordTextBox , password);
    }


    @When("user enters username and password and verifies login")
    public void user_enters_username_and_password_and_verifies_login(DataTable dataTable) {
       List< Map <String , String> > userCredentials = dataTable.asMaps();
       for(Map<String , String> userCreds : userCredentials){
           String username = userCreds.get("username");
           String password = userCreds.get("password");

        //   LoginPage login = new LoginPage();
           sendText(login.usernameTextBox, username);
           sendText(login.passwordTextBox , password);
           doClick(login.loginBtn);
           doClick(login.welcomeIcon);
           doClick(login.logoutLink);
       }
    }






}
