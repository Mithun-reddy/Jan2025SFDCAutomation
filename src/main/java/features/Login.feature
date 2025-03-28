Feature: Login Functionality

Background:
#Given User is on login page

#@sanity
#Scenario: Verify login with in-valid credentials
#When User enters in-valid id "<username>"
#And User enters in-valid  "<password>"
#And User clicks on login button
#Then User should see a error message
#Examples:
#|username          | password|
#|mithun@ta.com     |mithun123|
#|deekshith@ta.com  |deek123  |
#
#@regression
#Scenario: Verify login with valid credentials
#When User enters valid username as "mithun.R@fjksnb.com"
#And User enters valid password as "m.com"
#And User clicks on login button
#Then User should land on home page

@test
Scenario: Verify if student pass or fail
Given User takes test
When User evaluation is done
Then User result is published
|result|
|35|
|40|
|20|

