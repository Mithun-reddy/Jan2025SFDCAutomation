Feature: Login Functionality

Background:
Given User is on login page

Scenario: Verify login with in-valid credentials
When User enters in-valid username
And User enters in-valid password
And User clicks on login button
Then User should see a error message

Scenario: Verify login with valid credentials
When User enters valid username
And User enters valid password
And User clicks on login button
Then User should land on home page