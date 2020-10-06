$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Configuration/Role creation.feature");
formatter.feature({
  "name": "Role Creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Creating New Role",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Role Creation page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter Role name\u003cRolename\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on create button for create Role",
  "keyword": "And "
});
formatter.step({
  "name": "User can search for created Role in list\u003cRolesearch\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Rolename",
        "Rolesearch"
      ]
    },
    {
      "cells": [
        "UserRole",
        "UserRole"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating New Role",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Role Creation page",
  "keyword": "Given "
});
formatter.match({
  "location": "RoleCreation_StepDef.user_is_on_Role_Creation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter Role nameUserRole",
  "keyword": "When "
});
formatter.match({
  "location": "RoleCreation_StepDef.user_has_to_enter_Role_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on create button for create Role",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreation_StepDef.user_has_to_click_on_create_button_for_create_Role()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can search for created Role in listUserRole",
  "keyword": "Then "
});
formatter.match({
  "location": "RoleCreation_StepDef.user_can_search_for_created_Role_in_list(String)"
});
formatter.result({
  "status": "passed"
});
});