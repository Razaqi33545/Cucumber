package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods { // When Executed Hooks will always be the first class executed in cucumber
    // Hooks will take care of opening and closing the browser.

   @Before
    public void preCondition(){
        openBrowserAndLaunchApplication(); // This has come from CommonMethods class
    }


    @After
    public void postCondition(){
        closeBrowser();  // This has come from CommonMethods class
    }











}
