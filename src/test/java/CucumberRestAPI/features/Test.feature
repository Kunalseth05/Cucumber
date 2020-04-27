Feature: Reset functionality on login page of Application 

Scenario Outline: Verification of Reset button

Given Open the Chrome and launch the application	
When Enter the Username "<username>" and Password "<password>"
Then Reset the credential

Examples:                      		

|username  |password  |
|Kunal     |132b |	
