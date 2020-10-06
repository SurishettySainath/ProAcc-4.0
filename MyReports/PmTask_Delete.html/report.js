$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Deletion/PmTask_Delete.feature");
formatter.feature({
  "name": "PmTask deletion",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "PmTask deletion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to PmTask Creation page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter PmTaskname\u003cPmTaskname\u003e in search box",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on delete button for PmTask",
  "keyword": "And "
});
formatter.step({
  "name": "User has successfully deleted PmTask",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "PmTaskname"
      ]
    },
    {
      "cells": [
        "jctest"
      ]
    }
  ]
});
formatter.scenario({
  "name": "PmTask deletion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to PmTask Creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "PmTask_Delete.user_should_navigate_to_PmTask_Creation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter PmTasknamejctest in search box",
  "keyword": "When "
});
formatter.match({
  "location": "PmTask_Delete.user_has_to_enter_PmTaskname_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button for PmTask",
  "keyword": "And "
});
formatter.match({
  "location": "PmTask_Delete.user_has_to_click_on_delete_button_for_PmTask()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted PmTask",
  "keyword": "Then "
});
formatter.match({
  "location": "PmTask_Delete.user_has_successfully_deleted_PmTask()"
});
formatter.result({
  "status": "passed"
});
});