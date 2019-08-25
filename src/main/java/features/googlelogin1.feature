
Feature: Google loginone


Scenario: valid google login

Given enter username
When enter password
Then click on login
Then user navigate to login home page



Scenario: invalid google login

Given enter invalid username
When enter invalid password
Then click on Inlogin
Then user navigate to inlogin home page
