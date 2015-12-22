$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/learning/test/stores.feature");
formatter.feature({
  "line": 1,
  "name": "Authentication",
  "description": "",
  "id": "authentication",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Successfully logging in"
    },
    {
      "line": 4,
      "value": "#  Given the Symbiote home page \"https://symbiote-app.herokuapp.com\" on \"chrome\""
    },
    {
      "line": 5,
      "value": "#  When logging in as an admin"
    },
    {
      "line": 6,
      "value": "#  Then the home page navigation is available"
    },
    {
      "line": 7,
      "value": "#"
    }
  ],
  "line": 9,
  "name": "Successfully logging in",
  "description": "",
  "id": "authentication;successfully-logging-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "the Symbiote home page \"https://symbiote-app.herokuapp.com\" on \"phantomjs\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "logging in as an admin with details",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12
    },
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the home page navigation is available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://symbiote-app.herokuapp.com",
      "offset": 24
    },
    {
      "val": "phantomjs",
      "offset": 64
    }
  ],
  "location": "LoginSteps.the_symbiote_home_page_something_on_something(String,String)"
});
formatter.result({
  "duration": 185020473,
  "error_message": "java.lang.NullPointerException\r\n\tat com.learning.test.LoginPage.navigateTo(LoginPage.java:36)\r\n\tat com.learning.test.LoginSteps.the_symbiote_home_page_something_on_something(LoginSteps.java:23)\r\n\tat ✽.Given the Symbiote home page \"https://symbiote-app.herokuapp.com\" on \"phantomjs\"(com/learning/test/stores.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.logging_in_as_an_admin_with_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.the_home_page_navigation_is_available()"
});
formatter.result({
  "status": "skipped"
});
});