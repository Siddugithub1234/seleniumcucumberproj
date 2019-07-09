Feature: To test the register for test me app
Scenario: Valid registration scenario
Given url of testmeapp "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When user enters "rahulji" as username
And user enters "rahul" as firstname
And user enters "viru" as lastname
And user enters "abc123" as password
And user enters "abc123" as confirmpassword
And user enters male as gender
And user enters "askme@gmail.com" as email
And user enters "9913193559" as mobilenumber
And user enters "04-04-1974" as DOB
And user enters "CBE" as address
And user select "What is your Birth Place?"
And user enters "Tamil" as answer
Then Quit Browser