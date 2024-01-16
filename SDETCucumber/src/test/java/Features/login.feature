Feature: Login page application of saucedemo app
Scenario: Check login is successful with valid creds
Given User is on login page
When User enters valid username and password
And Click on login Button
Then User is navigated to Home Page
And Close the browser
