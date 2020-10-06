$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Configuration/CreateInstance.feature");
formatter.feature({
  "name": "Create Instance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Creajcg New Instance",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on create instance page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter instance name\u003cInstancename\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User has to select project from dropdown\u003cprojecjcstancename\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click on create button for create instance",
  "keyword": "And "
});
formatter.step({
  "name": "User can search for created instance in list\u003cInstancesearch\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Instancename",
        "projecjcstancename",
        "Instancesearch"
      ]
    },
    {
      "cells": [
        "J12",
        "jc Pilot Phase Test",
        "J12"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creajcg New Instance",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on create instance page",
  "keyword": "Given "
});
formatter.match({
  "location": "Addinstancetoproject.user_is_on_project_instance_configuration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter instance nameJ12",
  "keyword": "When "
});
formatter.match({
  "location": "Addinstancetoproject.user_has_to_enter_instance_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select project from dropdownjc Pilot Phase Test",
  "keyword": "And "
});
formatter.match({
  "location": "Addinstancetoproject.user_has_to_select_project_from_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on create button for create instance",
  "keyword": "And "
});
formatter.match({
  "location": "Addinstancetoproject.user_click_on_create_button_and_navigate_to_view_project_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can search for created instance in listJ12",
  "keyword": "Then "
});
formatter.match({
  "location": "Addinstancetoproject.user_can_search_for_instance(String)"
});
formatter.result({
  "status": "passed"
});
});