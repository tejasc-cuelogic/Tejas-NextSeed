@smoke
Feature:User should be able to do investor sign up

Background: Flow from home page to open account pop up 

Given User should navigate to open account pop up and clicks on investor option
Scenario: User want to do Investor sign up using invalid credentials 

When User Clicks on sign up button
And User click investor option
And User enters invalid login credentials
And User clears invalid details and enters investor details
And User Again enters valid details
Then Exit from application

