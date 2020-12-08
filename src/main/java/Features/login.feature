Feature: Free CRM Login Feature 
#
#Using  Datadriven with Regular expression, means without examples keyword.
#Scenario: Free CRM Login Test Scenario

#Given user is already on login Page
#When user title of login page is Free CRM
#Then user enters "shashankk" and "test123"
#Then user click on login button
#Then user is on Home Page
#Then user quit browser

#
#Scenario: user is able to create a new contact
#Given user is already on Home Page
#Then user mouse over on contact link
#Then user click on new contact link
#Then user enters first name and last name
#Then verify new contact created 


#Using  Data driven with Examples Keyword, means examples keyword, when multiple sets of data alwz use Scenario outline with Examples keyword
Scenario Outline: Free CRM Login Test Scenario
# The data is applicable for all test case.
Given user is already on login Page
When user title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user click on login button
Then user is on Home Page
Then user quit browser



Examples:
     | username | password |
     |shashankk | test123  |
     | tom      | test456  |




