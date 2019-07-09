Feature: Login feature for demo webshop
Scenario: Valid login scenario
Given url of demowebshop "http://demowebshop.tricentis.com/login"
When user en "askmail@email.com" as username
And user en "abc123" as password
Then user in webshop