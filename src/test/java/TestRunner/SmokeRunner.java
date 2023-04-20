package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\Features" ,
        glue = "StepDefinitions" ,
        dryRun = false ,
        tags = "@AddingNewEmp" , // This tag will run only entered test cases we can use multiple also "@TestCase1 or @TestCase2" If we want all to run comment tags
        plugin = {"pretty" , "html:target/Cucumber.html" , "json:target/Cucumber.json"}  ) // Pretty shows some important information in the console about ran test cases.

// "html:target/Cucumber.html" : is used to generate the report in the target folder in html format.
//

/* In cucumberOptions, we paste the path of feature file and StepDefinition file to map them to runner class and dryRun = true
   will not execute all the testcases and will only auto-generate us the code for the latest changes we have created in a certain test case
   in feature file, and when we want to run our code we must set dryRun = false

* We can run the code from feature file as well, but we do not run it from feature file, and we are using runner class because
  there might be 100s of feature files in a project, and we cannot run 100s of feature files all ones, and we run it individually.

* We use tagging to execute only a particular test case from a number of testcases with @ as in tags = "@TestCase1" from Login.feature
  We can run 100s of testcase with just naming the same tag such @smoke we can run 100s of smoke test cases simultaneously,
  and we can use "@ TestCase1 or @TestCase2" to run different testcases.

* target folder is mostly used for storing the test case execution reports generated using cucumber.
* To view HTML report right-click on the report go to open in and then go to browser and open in browser.
*/


public class SmokeRunner {

}
