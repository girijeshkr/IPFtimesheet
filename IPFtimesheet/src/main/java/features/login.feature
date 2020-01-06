@FunctionalTest
Feature: IPF Timesheet  Login Feature

#Scenario: IPF Timesheet  Test Login Feature 

#Given url launched successfully and user is already on login page  
#When title of login page is Timesheet
#Then user enter username and password
#Then user clicks on Login Button
#Then user is on homepage

#without examples keyword
#Scenario: IPF Timesheet  Test Login Feature 

#Given url launched successfully and user is already on login page  
#When title of login page is Timesheet
#Then user enter username "admin" and password "123456"
#Then user clicks on Login Button
#Then user is on homepage

#with examples keyword

#Scenario Outline: IPF Timesheet  Test Login Feature 

#Given url launched successfully and user is already on login page  
#When title of login page is Timesheet
#Then user enter username "<username>" and password "<password>"
#Then user clicks on Login Button
#Then user is on homepage
#Then close the browser

#Examples:
 #        | username | password |
  #       | admin | 123456 |
   #      | deepak | Welcome123 |
    #     | demo | 123abs |
         
    # without example keyword & scenario outline & without any regular expression 
    
#Scenario: IPF Timesheet  Test Login Feature 

#Given url launched successfully and user is already on login page  
#When title of login page is Timesheet
#Then user enter username  and password
#| admin | 123456 |
#Then user clicks on Login Button
#Then user is on homepage
#Then close the browser

@SmokeTest1
Scenario: IPF Timesheet Login logout Feature with valid user credentials  

Given url launched successfully and user is on login page  
When title of login page is Timesheet
Then user enter username  and password
 |username | password |
 | admin   | 123456   |
Then user clicks on Login Button
Then user is on homepage
Then user click on logoff button


@SmokeTest2
Scenario: User is able to Create a new user from User navigation link available on home page

Given user is on home page
When user navigation link is available on home page
Then click on user navigation link
Then click on create new button
Then fill all the user information
| livedemo128 | livedemo128 |
| livedemo128 | Manager |
| B | MAS - MAS | 
| IND | IND |
| livedemo128| livedemo128@ipf.com |
|  |  |
| 01312019 | 12312019 |
Then click on save button
Then click on edit button to add project to the user
Then click on checkbox to select a project
Then click on save button to assign project
Then click on any month and fill user timesheet
Then click on off button in Timesheet page and put it ON
Then fill the timesheet with a  valid values and click on tab button
Then click on save button on timesheet page
Then click on submit button



@SmokeTest3
Scenario: Admin Link Functionality which is available on home page navigation bar 

Given user is on home page with title as Timesheet
When Admin Link is available on home page navigation bar 
Then click on Admin Link which is available on home page navigation bar
Then select option Projects from Header dropdown
Then click on Download button 

@SmokeTest4
Scenario: user can create a new project from Nav-bar link Projects

Given  user is on IPF timesheet homepage
When   navigation bar is available with Project link on home page
Then click on project link
Then click on create new button
Then enter all the project Related details
| Name          | Description         | StartDate | EndDate |
| OffshoreDemoe1 | OffshoreDemoe2Mastek1 | 01312019   | 12312019 |
Then click on create button to create a new project


@SmokeTest5
Scenario: IPF Timesheet Login Logout feature with a valid & invalid user credentials 

Given url launched successfully and user is on login page of IPF timesheet  
When title of login page is displayed as  Timesheet
Then user enter username  and password for both the valid and invalid user
 |username | password |
 | admin   | 123456   |
 | wrong   | pas123  |
Then user clicks on Login
Then user is on homepage with valid user
Then user click on logoff button and enter invalid login credentials



@SmokeTest6
Scenario: IPF Timesheet Login Logout feature with a valid & invalid user credentials new

Given url launched successfully and user is on login page of IPF timesheet new 
When title of login page is displayed as  Timesheet new
Then user enter username  and password for both the valid and invalid user new



    
