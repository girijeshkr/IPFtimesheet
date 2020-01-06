@FunctionalTest
Feature: IPF Timesheet  Login Feature

@SmokeTest1
Scenario: IPF Timesheet Login logout Feature with valid user credentials  

Given url launched successfully and user is on login page old  
When title of login page is Timesheet old
Then user enter username  and password old
 |username | password |
 | admin   | 123456   |
Then user clicks on Login Button old
Then user is on homepage old
Then user click on logoff button old