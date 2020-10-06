$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Configuration/View instance to project.feature");
formatter.feature({
  "name": "View instance project list",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "View instance project list functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User navigate to view instance project list page",
  "keyword": "Given "
});
formatter.step({
  "name": "User can search instance project name in search\u003cInstancename\u003e",
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
        "F01"
      ]
    }
  ]
});
formatter.scenario({
  "name": "View instance project list functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User navigate to view instance project list page",
  "keyword": "Given "
});
formatter.match({
  "location": "ViewInstanceToProject_StepDef.user_navigate_to_view_instance_project_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can search instance project name in searchF01",
  "keyword": "Then "
});
formatter.match({
  "location": "ViewInstanceToProject_StepDef.user_can_search_instance_project_name_in_search(String)"
});
formatter.result({
  "status": "passed"
});
});