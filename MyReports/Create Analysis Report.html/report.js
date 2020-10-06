$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Assessment/Create Analysis_Consultant.feature");
formatter.feature({
  "name": "Create Analysis",
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
  "name": "Create Analysis functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on create analysis page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select Customer Name\u003cCustomer_Name\u003e, Project Name\u003cProject_Name\u003e and Instance Name\u003cInstance_Name\u003e from the dropdown",
  "keyword": "When "
});
formatter.step({
  "name": "User has to upload SAP READINESS CHECK FILES for Activities\u003cActivities\u003e, BWExtractors\u003cBWExtractors\u003e, CustomCode\u003cCustomCode\u003e, HANADatabase\u003cHANADatabase\u003e, FioriApps\u003cFioriApps\u003e, RelevantSimplification\u003cRelevantSimplification\u003e, SAPReadiness\u003cSAPReadiness\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click on the term of use and acknowldge checkboxes",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click on start analysis button",
  "keyword": "And "
});
formatter.step({
  "name": "User should successfully navigate to readinesscheck",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Customer_Name",
        "Project_Name",
        "Instance_Name",
        "Activities",
        "BWExtractors",
        "CustomCode",
        "HANADatabase",
        "FioriApps",
        "RelevantSimplification",
        "SAPReadiness"
      ]
    },
    {
      "cells": [
        "jc Test",
        "jc Pilot Phase Test",
        "J12",
        "Activities.xlsx",
        "Bwextractors.xlsx",
        "CustomCode.xlsx",
        "HanaDatabaseTables.xlsx",
        "RecommendedFioriApps.xlsx",
        "RelevantSimplificationItems.xlsx",
        "SAP Readiness Check.docx"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Analysis functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on create analysis page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAnalysisStepDef.user_is_on_create_analysis_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select Customer Namejc Test, Project Namejc Pilot Phase Test and Instance NameJ12 from the dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAnalysisStepDef.user_has_to_select_Customer_Name_Project_Name_and_Instance_Name_from_the_dropdown(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to upload SAP READINESS CHECK FILES for ActivitiesActivities.xlsx, BWExtractorsBwextractors.xlsx, CustomCodeCustomCode.xlsx, HANADatabaseHanaDatabaseTables.xlsx, FioriAppsRecommendedFioriApps.xlsx, RelevantSimplificationRelevantSimplificationItems.xlsx, SAPReadinessSAP Readiness Check.docx",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAnalysisStepDef.user_has_to_upload_SAP_READINESS_CHECK_FILES(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on the term of use and acknowldge checkboxes",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAnalysisStepDef.user_has_to_click_on_the_term_of_use_and_acknowldge_checkboxes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on start analysis button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAnalysisStepDef.user_has_to_click_on_start_analysis_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should successfully navigate to readinesscheck",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAnalysisStepDef.User_should_successfully_navigate_to_readinesscheck()"
});
formatter.result({
  "status": "passed"
});
});