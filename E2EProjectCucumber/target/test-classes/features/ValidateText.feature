Feature: Validate Text

Scenario: Verify city name in Address
Given Initialize webdriver
And open the Marriott website
When You reach site click on Marriott Bonvoy 
And Click on Member Benefits
Then Verify if we have the text "Mobile Check-In and Mobile Key" in the benefits page