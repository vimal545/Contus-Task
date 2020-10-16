Feature: To validate the Google search suggestions

  Scenario Outline: To verify the google suggestions
    Given user has to be there in google page
    When User has to enter the text "<search>" in search field
    
    
    Then User is validating the suggestions which is matching with the entered value in search bar

    Examples:
     |search|
     |Automation|