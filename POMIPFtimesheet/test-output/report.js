$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/deepak13862/eclipse-workspace/POMIPFtimesheet/src/main/java/feature/time.feature");
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
  "name": "IPF Timesheet Login logout Feature with valid user credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest1"
    }
  ]
});
formatter.step({
  "name": "url launched successfully and user is on login page old",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdeffile.url_launched_successfully_and_user_is_on_login_page_old()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of login page is Timesheet old",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdeffile.title_of_login_page_is_Timesheet_old()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username  and password old",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "123456"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdeffile.user_enter_username_and_password_old()"
});
formatter.result({
  "error_message": "cucumber.runtime.CucumberException: Step [user enter username  and password old] is defined with 0 parameters at \u0027stepdeffile.Stepdeffile.user_enter_username_and_password_old() in file:/C:/Users/deepak13862/eclipse-workspace/POMIPFtimesheet/target/classes/\u0027.\nHowever, the gherkin step has 1 arguments:\n * Table:\n      | username | password |\n      | admin    | 123456   |\n\nStep text: user enter username  and password old\r\n\tat cucumber.runner.PickleStepDefinitionMatch.arityMismatch(PickleStepDefinitionMatch.java:84)\r\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:36)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks on Login Button old",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdeffile.user_clicks_on_Login_Button_old()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is on homepage old",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdeffile.user_is_on_homepage_old()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on logoff button old",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdeffile.user_click_on_logoff_button_old()"
});
formatter.result({
  "status": "skipped"
});
});