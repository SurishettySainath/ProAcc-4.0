$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Post_Conversion/PostConversionMonitor_Consultant.feature");
formatter.feature({
  "name": "Post-Conversion functionality for ProAcc",
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
        "jc_Consultant",
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
  "name": "User enters jc_Consultant and b12345@",
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
  "name": "Assessment Monitor functionality for Consultant",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Consultant Monitor page\u003cPhases\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select Consultant Customername\u003cCustomernameforAssessmentConsultant\u003e and Project Name\u003cProjectnameforAssessmentConsultant\u003e and Consultant Instance Name\u003cInstancenameforAssessmentConsultant\u003e from the dropdown for consultant Assessment Monitor",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on select instance button for Consultant Assessment Monitor",
  "keyword": "And "
});
formatter.step({
  "name": "User has to edit task for consultant",
  "keyword": "And "
});
formatter.step({
  "name": "User should select instance successfully for Assessment Monitor Consultant",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "CustomernameforAssessmentConsultant",
        "ProjectnameforAssessmentConsultant",
        "InstancenameforAssessmentConsultant",
        "Phases"
      ]
    },
    {
      "cells": [
        "jc Test",
        "jc Pilot Phase Test",
        "J12",
        "Post-Conversion"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Assessment Monitor functionality for Consultant",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Consultant Monitor pagePost-Conversion",
  "keyword": "Given "
});
formatter.match({
  "location": "AssessmentMonitor_Consultant.user_is_on_Consultant_Monitor_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Consultant Customernamejc Test and Project Namejc Pilot Phase Test and Consultant Instance NameJ12 from the dropdown for consultant Assessment Monitor",
  "keyword": "When "
});
formatter.match({
  "location": "AssessmentMonitor_Consultant.user_has_to_select_Consultant_Customername_and_Project_Name_and_Consultant_Instance_Name_from_the_dropdown_for_consultant_Assessment_Monitor(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on select instance button for Consultant Assessment Monitor",
  "keyword": "And "
});
formatter.match({
  "location": "AssessmentMonitor_Consultant.user_has_to_click_on_select_instance_button_for_Consultant_Assessment_Monitor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to edit task for consultant",
  "keyword": "And "
});
formatter.match({
  "location": "AssessmentMonitor_Consultant.user_has_to_edit_task_for_consultant()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select instance successfully for Assessment Monitor Consultant",
  "keyword": "Then "
});
formatter.match({
  "location": "AssessmentMonitor_Consultant.user_should_select_instance_successfully_for_Assessment_Monitor_Consultant()"
});
formatter.result({
  "status": "passed"
});
});