Feature: Login Functionalities

  # We use tagging when we want to run only chosen testcase and not all with @
  @Valid_Admin
  Scenario: Valid Admin login
     # Given open the browser and launch HRMS application (Hooks will take care of it that's why we comment it)
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully
     # Then close the browser (Hooks will take care of it that's why we comment it)

    # Hash is used for commenting any line in feature file.

    # HOOKS Class : is used for defining pre and post steps in any cucumber framework. It will make sure the browser closes even if the test
    # is failing
    # HOOKS Class is always created inside the StepDefinitions folder.
    # HOOKS Class cannot be inherited, but it can inherit other classes. (This is extra info not needed for job)