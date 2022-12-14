#@Loginfn
@Loginfn @manageCheckin
Feature: To validate manage module functionality of cebupacificair application

Scenario: To validate Checkin functionality of manage module
Given The user has to click the Manage mod Checkin
When The user has to enter username "Sujatha0711@gmail.com" and password "Varshini@0711"
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"

Scenario: check Booking functionality of manage module
When The user has to click the Manage mod Booking
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"

Scenario: check Flightstatus functionality of manage module
When The user enter origin and destination date for check status
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"

Scenario: check Add-ons functionality of manage module
When The user verify Add-ons features
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"

Scenario: check Special Assistance functionality of manage module
When The user verify special assistance features
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"