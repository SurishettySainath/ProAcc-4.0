$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Configuration/View project to customer.feature");
formatter.feature({
  "name": "View customer project list",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "View customer project list functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User navigate to view customer project list page",
  "keyword": "Given "
});
formatter.step({
  "name": "User can search customer name in search\u003cSearch\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Search"
      ]
    },
    {
      "cells": [
        "Conversion Pilot Phase"
      ]
    }
  ]
});
formatter.scenario({
  "name": "View customer project list functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User navigate to view customer project list page",
  "keyword": "Given "
});
formatter.match({
  "location": "ViewProjectToCustomer_StepDef.user_navigate_to_view_customer_project_list_page()"
});
