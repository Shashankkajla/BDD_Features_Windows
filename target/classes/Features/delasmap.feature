Feature: Free CRM Deals data Creation

Scenario: Free CRM adding a New Deals Scenario

#Using Data Table to achieve data driven, enter data after the line directly data is applicable for that particular step only.
# Using Map Object Here

Given user is on login page
When page title is Free CRM
Then user enter the credentials 
| Username  | Password | 
| shashankk | test123  |

Then user check on to login button
Then user navigates to Home Page
Then user put on cursor to new Deals Link
Then user select new Deals Link 
Then user enters deals details

| Title      | Amount | Probability | Commission |
| test_deal1 | 1000   |    50       |    10      |
| test_deal2 | 2000   |    40       |    20      |
| test_deal3 | 3000   |    30       |    40      |
 
Then user needs to quit from the browser

