Feature: Searching the employee

  @SearchEmpID
  Scenario: Search Employee by Id
    # Given open the browser and launch HRMS application (Hooks will take care of it that's why we comment it)
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM Option
    When user enters valid employee id
    When  clicks on search button
    Then user see employee information is displayed
     # Then close the browser (Hooks will take care of it that's why we comment it)


    @SearchEmpByJobTitle
    Scenario: Search Employee by Job Title
     # Given open the browser and launch HRMS application (Hooks will take care of it that's why we comment it)
      When user enters valid email and valid password
      And click on login button
      When user clicks on PIM Option
      When user selects Job Title, Employee Status, and Include
      When  clicks on search button
      Then user see employee information is displayed
     # Then close the browser (Hooks will take care of it that's why we comment it)