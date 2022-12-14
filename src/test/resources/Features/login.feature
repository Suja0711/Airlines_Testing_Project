Feature: To validate login functionality of cebupacificair application
@Loginfn @manageCheckin
Scenario: To validate login functionality of cebupacificair application
Given The user should launch cebupacificair website
When Pop up window should be closed
When The user has to fill the email and password
When The user has to click the Login button
Then The user should be in valid login page