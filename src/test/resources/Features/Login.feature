Feature: Login Functionalities

  # We use tagging when we want to run only chosen testcase and not all with @
  @smoke
  Scenario: Valid Admin login
     # Given open the browser and launch HRMS application (Hooks will take care of it that's why we comment it)
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully
     # Then close the browser (Hooks will take care of it that's why we comment it)

    # HOOKS Class : is used for defining pre and post steps in any cucumber framework.
    # Hooks will make sure the browser closes even if the test is failing
    # HOOKS Class is always created inside the StepDefinitions folder.
    # HOOKS Class cannot be inherited, but it can inherit other classes. (This is extra info not needed for job)


  @smoke2
  Scenario: Valid Admin login
     # Given open the browser and launch HRMS application
    When user enters valid "admin" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully
     # Then close the browser

  # @smoke2 in Step 2 capitalize the user name ADMIN to know that it is picked from Login.feature file
  # This is inbuilt functionality of cucumber and the data is pushed from feature file to java file.
  # which is called regular expression functionality of cucumber

  # We have learned 3 ways to get data into Java:
  # 1) Hard coding which is not professional and should not be used.
  # 2) property file of Java
  # 3) regular expression functionality of cucumber
  # 4) Scenario Outline : provides you an alternative to Data Driven Testing and also supports parameterization.
                        # Scenario Outline is always used along with the keyword 'Examples'


  # Executing the same test case with different data is called parameterization. This code is executed without using Java.

  @scenarioOutline
  # When you want to do parameterization or Data driven testing use the Scenario Outline:
  Scenario Outline: Login with multiple credentials using scenario outline
    # Given open the browser and launch HRMS application
    When user enters valid "<username>" and valid "<password>"
    And click on login button
    Then user is logged in successfully
     # Then close the browser
    Examples:
      | username | password   |
      | admin    | Hum@nhrm123|
      | ADMIN    | Hum@nhrm123|
      | Jason    | Hum@nhrm123|
# With Scenario Outline the browser will open and close three times in the above example.
  # but in data Table it will only open ones and close ones.

    #data Table
   @dataTable
  Scenario: Login with multiple credentials using data table
    When user enters username and password and verifies login

      | username | password   |
      | admin    | Hum@nhrm123|
      | ADMIN    | Hum@nhrm123|
      | Jason    | Hum@nhrm123|