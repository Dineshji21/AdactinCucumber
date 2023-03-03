Feature: Validation of login page in facebook web application 

Scenario: TC01_validation of login page with valid credentials
Given User launch facebook webapplication
When User enter valid user name and valid password
And User click the login Login Button
Then User verify homepage is displayed 


Scenario: TC02_validation of lo9gin page with invalid credential
Given User launch the facebook web application 
When User enter thr valid user name and valid password 
And User enter the Login Button
Then user verify the error message is displayed