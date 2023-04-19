Feature: Employee

  # We use tagging when we want to run only chosen testcase and not all with @
  # a Test Case can have multiple tags such as @AddingNewEmp @smoke in the following test case.
  @AddingNewEmp @smoke1
  Scenario: Adding a new Employee
     # Given open the browser and launch HRMS application (Hooks will take care of it that's why we comment it)
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM Option
    And user clicks on add employee button
    And user enters firstname, middle-name and lastname
    And user clicks on save button
     # Then close the browser (Hooks will take care of it that's why we comment it)

