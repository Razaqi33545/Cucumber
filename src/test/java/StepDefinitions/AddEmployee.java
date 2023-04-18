package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends CommonMethods {

    @When("user clicks on PIM Option")
    public void user_clicks_on_pim_option() {
    WebElement pimTab = driver.findElement(By.id("menu_pim_viewPimModule"));
    doClick(pimTab);
    }

    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
     WebElement addEmpBtn = driver.findElement(By.id("menu_pim_addEmployee"));
    doClick(addEmpBtn); // We have created doClick generic method in CommonMethods and are using it repetitively.
    }

    @When("user enters firstname, middle-name and lastname")
    public void user_enters_firstname_middle_name_and_lastname() {
   // driver.findElement(By.id("firstName")).sendKeys(ConfigReader.getPropertyValue("firstname")); // This has come from Config.properties
        WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
        sendText(firstNameTextBox , ConfigReader.getPropertyValue("firstname"));

  //  driver.findElement(By.id("middleName")).sendKeys(ConfigReader.getPropertyValue("middle-name"));
        WebElement middleNameTextBox = driver.findElement(By.id("middleName"));
        sendText(middleNameTextBox , ConfigReader.getPropertyValue("middle-name"));

   // driver.findElement(By.id("lastName")).sendKeys(ConfigReader.getPropertyValue("lastname"));
        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
        sendText(lastNameTextBox , ConfigReader.getPropertyValue("lastname"));
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
    WebElement saveBtn = driver.findElement(By.id("btnSave"));
    doClick(saveBtn);
    }






}
