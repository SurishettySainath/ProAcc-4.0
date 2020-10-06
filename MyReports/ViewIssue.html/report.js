$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/IssueTrack/ViewIssue.feature");
formatter.feature({
  "name": "View Issue List",
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
  "name": "View Issue",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate Issue List page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should select Project name\u003cProjectNameforIssuelist\u003e and Instance name\u003cInstanceNameforIssuelist\u003e from the dropdown for issue list",
  "keyword": "When "
});
formatter.step({
  "name": "User should click on select instance button for issue list",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ProjectNameforIssuelist",
        "InstanceNameforIssuelist"
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
  "name": "View Issue",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate Issue List page",
  "keyword": "Given "
});
formatter.match({
  "location": "ViewIssue.user_should_be_navigate_Issue_List_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select Project namejc Pilot Phase Test and Instance nameJ12 from the dropdown for issue list",
  "keyword": "When "
});
formatter.match({
  "location": "ViewIssue.user_should_select_Project_name_and_Instance_name_from_the_dropdown(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on select instance button for issue list",
  "keyword": "And "
});
formatter.match({
  "location": "ViewIssue.user_should_click_on_select_instance_button()"
});
formatter.result({
  "status": "passed"
});
});