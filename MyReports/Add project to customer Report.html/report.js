$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Configuration/CreateProject.feature");
formatter.feature({
  "name": "Project Creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Creajcg new Project",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Project Creation page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter project name\u003cprojectname\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User has to enter project description\u003cdescription\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select Customer name from dropdown\u003ccustomername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select Project manager from dropdown\u003cprojectmanager\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to select Scenario from dropdown\u003cScenario\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click create button for project creation",
  "keyword": "And "
});
formatter.step({
  "name": "User can search for created project in list\u003cprojectname\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "projectname",
        "description",
        "customername",
        "projectmanager",
        "Scenario"
      ]
    },
    {
      "cells": [
        "jc Pilot Phase Test",
        "Pro acc Inprogress",
        "jc Test",
        "jc_PM",
        "MERGE"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creajcg new Project",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Project Creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "Addprojecttocustomer.user_is_on_Customer_project_configuration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter project namejc Pilot Phase Test",
  "keyword": "When "
});
formatter.match({
  "location": "Addprojecttocustomer.user_has_to_enter_project_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter project descriptionPro acc Inprogress",
  "keyword": "And "
});
formatter.match({
  "location": "Addprojecttocustomer.user_has_to_enter_description(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Customer name from dropdownjc Test",
  "keyword": "And "
});
formatter.match({
  "location": "Addprojecttocustomer.user_has_to_select_Customer_name_from_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Project manager from dropdownjc_PM",
  "keyword": "And "
});
formatter.match({
  "location": "Addprojecttocustomer.user_has_to_select_project_manager_from_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Scenario from dropdownMERGE",
  "keyword": "And "
});
formatter.match({
  "location": "Addprojecttocustomer.User_has_to_select_Scenario_from_dropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click create button for project creation",
  "keyword": "And "
});
formatter.match({
  "location": "Addprojecttocustomer.User_has_to_click_create_button_for_project_creation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can search for created project in listjc Pilot Phase Test",
  "keyword": "Then "
});
formatter.match({
  "location": "Addprojecttocustomer.user_can_serach_for_project(String)"
});
formatter.result({
  "status": "passed"
});
});