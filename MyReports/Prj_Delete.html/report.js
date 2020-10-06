$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Deletion/Prj_Delete.feature");
formatter.feature({
  "name": "Project deletion",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Project deletion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Project Creation page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter Projectname\u003cProjectname\u003e in search box",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on delete button for project",
  "keyword": "And "
});
formatter.step({
  "name": "User has successfully deleted Project",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Projectname"
      ]
    },
    {
      "cells": [
        "jc Pilot Phase Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Project deletion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Project Creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "Prj_Delete.user_should_navigate_to_Project_Creation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter Projectnamejc Pilot Phase Test in search box",
  "keyword": "When "
});
formatter.match({
  "location": "Prj_Delete.user_has_to_enter_Projectname_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button for project",
  "keyword": "And "
});
formatter.match({
  "location": "Prj_Delete.user_has_to_click_on_delete_button_for_project()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted Project",
  "keyword": "Then "
});
formatter.match({
  "location": "Prj_Delete.user_has_successfully_deleted_Project()"
});
formatter.result({
  "status": "passed"
});
});