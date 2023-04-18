package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class EmployeeSearch extends CommonMethods {
    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
      WebElement empIdTextBox = driver.findElement(By.id("empsearch_id"));
      sendText(empIdTextBox , ConfigReader.getPropertyValue("empId"));
    }

    @When("user selects Job Title, Employee Status, and Include")
    public void user_select_job_title() {
       WebElement jobTitleDdl = driver.findElement(By.id("empsearch_job_title"));
        selectByOption(jobTitleDdl , "Singer");

        WebElement EmpStatusDdl = driver.findElement(By.id("empsearch_employee_status"));
        selectByOption(EmpStatusDdl , "Active");

        WebElement includeDdl = driver.findElement(By.id("empsearch_termination"));
        selectByOption(includeDdl , "Current and Past Employees");
    }

    @When("clicks on search button")
    public void clicks_on_search_button() {
        WebElement searchButton = driver.findElement(By.id("searchBtn"));
        doClick(searchButton);
    }

    @Then("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("The employee information is Displayed");
    }





}
