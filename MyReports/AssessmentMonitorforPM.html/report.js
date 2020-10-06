$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Assessment/AssessmentMoniterforPM.feature");
formatter.feature({
  "name": "Assessment Monitor for PM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Assessment Monitor functionality for PM",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Assessment Monitor page for project manager",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to select Project Name\u003cProjectnameforAssessmentPM\u003e and Instance Name\u003cInstancenameforAssessmentPM\u003e from the dropdown for project Assessment Monitor",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on select instance button for PMAssessment Monitor",
  "keyword": "And "
});
formatter.step({
  "name": "User has to edit task\u003cEstDurationPM\u003e,\u003cActDurationPM\u003e,\u003cNotePM\u003e for project manager",
  "keyword": "And "
});
formatter.step({
  "name": "User should select instance successfully for Assessment Monitor PM",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ProjectnameforAssessmentPM",
        "InstancenameforAssessmentPM",
        "EstDurationPM",
        "ActDurationPM",
        "NotePM"
      ]
    },
    {
      "cells": [
        "\"Conversion Pilot Phase Test\"",
        "\"D01\"",
        "\"3 days\"",
        "\"5 days\"",
        "\"Work In Progress\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Assessment Monitor functionality for PM",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Assessment Monitor page for project manager",
  "keyword": "Given "
});
formatter.match({
  "location": "AssessmentMonitorforPM_StepDef.user_is_on_Assessment_Monitor_page_for_project_manager()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke method createNode() on null object\r\n\tat org.codehaus.groovy.runtime.NullObject.invokeMethod(NullObject.java:91)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.call(PogoMetaClassSite.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.NullCallSite.call(NullCallSite.java:35)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\r\n\tat proAcc_Stepdef.AssessmentMonitorforPM_StepDef.user_is_on_Assessment_Monitor_page_for_project_manager(AssessmentMonitorforPM_StepDef.groovy:103)\r\n\tat ✽.User is on Assessment Monitor page for project manager(Include/features/proAcc_Featurefile/Assessment/AssessmentMoniterforPM.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User has to select Project Name\"Conversion Pilot Phase Test\" and Instance Name\"D01\" from the dropdown for project Assessment Monitor",
  "keyword": "When "
});
formatter.match({
  "location": "AssessmentMonitorforPM_StepDef.user_has_to_select_Project_Name_and_Instance_Name_from_the_dropdown_for_project_Assessment_Monitor(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to click on select instance button for PMAssessment Monitor",
  "keyword": "And "
});
formatter.match({
  "location": "AssessmentMonitorforPM_StepDef.user_has_to_click_on_select_instance_button_for_PMAssessment_Monitor()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to edit task\"3 days\",\"5 days\",\"Work In Progress\" for project manager",
  "keyword": "And "
});
formatter.match({
  "location": "AssessmentMonitorforPM_StepDef.user_has_to_edit_task(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should select instance successfully for Assessment Monitor PM",
  "keyword": "Then "
});
formatter.match({
  "location": "AssessmentMonitorforPM_StepDef.user_should_select_instance_successfully_for_Assessment_Monitor_PM()"
});
formatter.result({
  "status": "skipped"
});
});