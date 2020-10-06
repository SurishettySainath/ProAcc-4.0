$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Deletion/Instance_Delete.feature");
formatter.feature({
  "name": "Instance deletion",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Instance deletion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Instance Creation page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter Instancename\u003cInstancename\u003e in search box",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on delete button for Insatnce",
  "keyword": "And "
});
formatter.step({
  "name": "User has successfully deleted Instance",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Instancename"
      ]
    },
    {
      "cells": [
        "J12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Instance deletion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Instance Creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "Instance_Delete.user_should_navigate_to_Instance_Creation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter InstancenameJ12 in search box",
  "keyword": "When "
});
formatter.match({
  "location": "Instance_Delete.user_has_to_enter_Instancename_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button for Insatnce",
  "keyword": "And "
});
formatter.match({
  "location": "Instance_Delete.user_has_to_click_on_delete_button_for_Insatnce()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted Instance",
  "keyword": "Then "
});
formatter.match({
  "location": "Instance_Delete.user_has_successfully_deleted_Instance()"
});
formatter.result({
  "status": "passed"
});
});