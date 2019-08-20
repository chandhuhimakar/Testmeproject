Feature: my validation on Mercury Tours
Scenario: Login validation by registerd user 
Given User has launced the app
Then User enters the valid credentials
And  User clicks on submit button
Then User verfies the login status 

Scenario: Guest user registration in mercury tours
Given User launched th app of mercury tours 
Then User clicks on SignUp link
When User enters the valid data in the form 
And  User clicks on submit button available 
Then User Verifies the registration status   