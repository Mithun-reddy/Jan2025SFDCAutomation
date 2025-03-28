@sanity
Feature: Home page functionality


Scenario: Verify feed is displayed
Given User is on login page
When User logs in to the application
Then User should see home page
And User feed should be visible
