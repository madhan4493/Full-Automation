Feature: To check the login fuctionality

Scenario Outline: logging in with username and password

Given driver and browser detals and "http://www.qaclickacademy.com/"
When entering <username> and <pwd>
Then Validate the login
And Navigating back and closing the browser

Examples:

|username|pwd|
|madhan.vcet21@gmail.com|123456|
|ghazini.madhan@gmail.com|123456|