$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Home_Page/Dashboard.feature");
formatter.feature({
  "name": "To view all the details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to ProAcc page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on LOG IN button",
  "keyword": "When "
});
formatter.step({
  "name": "User will be logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "jc_PM",
        "b12345@"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to application",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to ProAcc page",
  "keyword": "Given "
});
formatter.match({
  "location": "LogintoProAcc_StepDef.user_should_navigate_to_ProAcc_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters jc_PM and b12345@",
  "keyword": "And "
});
formatter.match({
  "location": "LogintoProAcc_StepDef.user_enters(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on LOG IN button",
  "keyword": "When "
});
formatter.match({
  "location": "LogintoProAcc_StepDef.user_clicks_on_LOG_IN_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LogintoProAcc_StepDef.user_will_be_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on dashboard page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select projectName\u003cPrjName\u003e and Instance\u003cInstance\u003e from dropdown of dashboard module",
  "keyword": "When "
});
formatter.step({
  "name": "User has to verify texts and able to see the recent updates",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PrjName",
        "Instance"
      ]
    },
    {
      "cells": [
        "jc Pilot Phase Test",
        "J12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "Dashboard.user_is_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select projectNamejc Pilot Phase Test and InstanceJ12 from dropdown of dashboard module",
  "keyword": "When "
});
formatter.match({
  "location": "Dashboard.user_has_to_select_projectName_and_Instance_from_dropdown_of_dashboard_module(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to verify texts and able to see the recent updates",
  "keyword": "Then "
});
formatter.match({
  "location": "Dashboard.user_has_to_verify_texts_and_able_to_see_the_recent_updates()"
});
formatter.result({
  "status": "passed"
});
});