$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/deepak13862/eclipse-workspace/IPFtimesheet/src/main/java/features/login.feature");
formatter.feature({
  "name": "IPF Timesheet  Login Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "name": "IPF Timesheet Login Logout feature with a valid \u0026 invalid user credentials new",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest6"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url launched successfully and user is on login page of IPF timesheet new",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.url_launched_successfully_and_user_is_on_login_page_of_IPF_timesheet_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of login page is displayed as  Timesheet new",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.title_of_login_page_is_displayed_as_Timesheet_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username  and password for both the valid and invalid user new",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.user_enter_username_and_password_for_both_the_valid_and_invalid_user_new()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});