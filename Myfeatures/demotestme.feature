
Feature: my validation of testme app
Background: 
Given Launch Application TestMeapp
  Scenario Outline: login details for TestMe Application
    Given Test me is launched in browser 
    When User click on signin
   Then Enters valid username <"name">
    And Enters vaild password <"password">
   Then click on subit
    And verify the login status
 
  Examples:
      | name    | password     | 
      | lalitha |  Password123 | 
      | admin   |  Password456 | 
