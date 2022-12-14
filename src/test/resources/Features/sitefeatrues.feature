#@Loginfn 
@AboutMenu @Loginfn
Feature: To validate about menu functionality of cebupacificair application

Scenario: To validate details about the website
Given The user has to click the About menu Our Story
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/" 

Scenario: To validate details about media center
Given The user has to click the About menu Media Center
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"

Scenario: To validate details about connectivity
Given The user has to click the About menu Talk to Us
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"

Scenario: To validate details about Partners
Given The user has to click the About menu Campaigns & Partners
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"

Scenario: To validate details about CompanyInfo
Given The user has to click the About menu Company Information
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"

Scenario: To validate details about Carrers
Given The user has to click the About menu Careers
Then Wait for the page to load
Then Return to url "https://www.cebupacificair.com/"