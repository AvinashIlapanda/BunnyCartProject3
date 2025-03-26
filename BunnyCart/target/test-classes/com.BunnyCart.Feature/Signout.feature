Feature: 
Scenario: To sign and Signout
Given User opens the browser
And User navigates to the application Url "https://www.bunnycart.com"
When User clicks on Sign in link
And User enters the Sign in credentials
|bunnycart data.xlsx|
And User clicks on Sign in button
And User clicks on signout button
And User close the browser