$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/google.feature");
formatter.feature({
  "name": "To validate the Google search suggestions",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify the google suggestions",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user has to be there in google page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter the text \"\u003csearch\u003e\" in search field",
  "keyword": "When "
});
formatter.step({
  "name": "User is validating the suggestions which is matching with the entered value in search bar",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "search"
      ]
    },
    {
      "cells": [
        "Automation"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify the google suggestions",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to be there in google page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleStepsClass.user_has_to_be_there_in_google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the text \"Automation\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleStepsClass.user_has_to_enter_the_text_in_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is validating the suggestions which is matching with the entered value in search bar",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStepsClass.user_is_validating_the_suggestions_which_is_matching_with_the_entered_value_in_search_bar()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat org.stepdef.GoogleStepsClass.user_is_validating_the_suggestions_which_is_matching_with_the_entered_value_in_search_bar(GoogleStepsClass.java:42)\r\n\tat ✽.User is validating the suggestions which is matching with the entered value in search bar(src/test/resources/google.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});