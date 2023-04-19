Feature: Searching the employee

  # Background Keyword is used for all those steps which are common in all test cases in the same feature file till the time flow is not broken.
  # the moment a different line comes in, the flow breaks and rest lines are not counted as common such as after line 5 of the  both scenarios below.
  Background:
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM Option


  @smoke1
  Scenario: Search Employee by Id
    # Given open the browser and launch HRMS application (Hooks will take care of it that's why we comment it)
  #  When user enters valid email and valid password (Background will take care of this so we comment it)
   # And click on login button (Background will take care of this so we comment it)
   # When user clicks on PIM Option (Background will take care of this so we comment it)
    When user enters valid employee id
    When  clicks on search button
    Then user see employee information is displayed
     # Then close the browser (Hooks will take care of it that's why we comment it)


    @smoke1
    Scenario: Search Employee by Job Title
     # Given open the browser and launch HRMS application (Hooks will take care of it that's why we comment it)
    #  When user enters valid email and valid password (Background will take care of this so we comment it)
     # And click on login button (Background will take care of this so we comment it)
     # When user clicks on PIM Option (Background will take care of this so we comment it)
      When user selects Job Title, Employee Status, and Include
      When  clicks on search button
      Then user see employee information is displayed
     # Then close the browser (Hooks will take care of it that's why we comment it)