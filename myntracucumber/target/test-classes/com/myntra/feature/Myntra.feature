Feature: Shopping In The Myntra Application

Scenario: User Login The Web Application 
    Given user Launch The Web Application 
    When  user Click The Profile And Dropdown Will Be Commming 
    
Scenario: User Check The Order Page 
    When user Click The Order And Navigate To Order Page
     
Scenario: User click The overview Functionality
    And  user Click The Overview And Navigate TO Overview Page 
    And  user Click The Editprofile And Navigate To Edit Details Page
    And  user Enter The Full Name 
    And  user Enter The Email id 
    And  user Select The Gender 
    And  user Enter The Birthday Date  
    And  user Enter The Location 
    And  user Enter The Alternate Mobile Number
    Then user Click The Save Details Button and Displayed to verification Popup
    
Scenario: User Verify The Two Step Verification Functionalities
    When  user Select The mobile Number 
    Then  user Click on Request Otp And Display On Verify With Otp Page 
    