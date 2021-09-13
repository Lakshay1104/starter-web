Feature: Validate Address

Scenario: Verify city name in Address
Given Initialize webdriver
And open the Marriott website
When You reach site search for city name "Chennai" in destination field
And Click on Search
Then Verify if city name is there in first hotel address