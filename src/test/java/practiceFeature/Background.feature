Feature: use of back ground key word
Background:
launch the browser3
Enter the url3
Scenario: logint to the app
Given enter username2 "admin"
Then enter password2 "admin"
Then click on login button

Scenario: login with tables
 Then enter user name and browser2
      | username | password |
      | admin    | admin    |
    Then click on login button2
 
