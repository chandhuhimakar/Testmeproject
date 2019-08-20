
Feature: Mydemo on tags
 

 @Smoke @Sanity
  Scenario: login Validation on flipkart 
    Given application is running 
    Then user login
    @Regression
    Scenario: user access to protal 
    Given User searching with code
    Then user able to add to cart 
    @Smoke
    Scenario: user removes from cart 
    Given user able to see the items count on cart 
    Then user decides to remove an item 
    @Sanity
    Scenario: track order 
    Given user has active order 
    Then User Verifies the statusof the order  
    
    

