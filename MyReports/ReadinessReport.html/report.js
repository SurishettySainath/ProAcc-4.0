$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Assessment/ReadinessReport.feature");
formatter.feature({
  "name": "ReadinessReport",
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
        "GlobalVariable.userconsultant",
        "GlobalVariable.passwordconsultant"
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
  "name": "User enters GlobalVariable.userconsultant and GlobalVariable.passwordconsultant",
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
  "name": "ReadinessReport functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on ReadinessReport page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should select customer name\u003cCustomernameforReadinessReport\u003e, project name\u003cProjectnameforReadinessReport\u003e and instance name\u003cInstancenameforReadinessReport\u003e from the dropdown list",
  "keyword": "When "
});
formatter.step({
  "name": "User should see the Rediness report",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "CustomernameforReadinessReport",
        "ProjectnameforReadinessReport",
        "InstancenameforReadinessReport"
      ]
    },
    {
      "cells": [
        "James Test",
        "James Pilot Phase Test",
        "L01"
      ]
    }
  ]
});
formatter.scenario({
  "name": "ReadinessReport functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on ReadinessReport page",
  "keyword": "Given "
});
formatter.match({
  "location": "ReadinessReportStepDef.user_is_on_ReadinessReport_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke method createNode() on null object\r\n\tat org.codehaus.groovy.runtime.NullObject.invokeMethod(NullObject.java:91)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.call(PogoMetaClassSite.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.NullCallSite.call(NullCallSite.java:35)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\r\n\tat ReadinessReportStepDef.user_is_on_ReadinessReport_page(ReadinessReport_StepDef.groovy:100)\r\n\tat ✽.User is on ReadinessReport page(Include/features/proAcc_Featurefile/Assessment/ReadinessReport.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should select customer nameJames Test, project nameJames Pilot Phase Test and instance nameL01 from the dropdown list",
  "keyword": "When "
});
formatter.match({
  "location": "ReadinessReportStepDef.user_should_select_customer_name_project_name_and_instance_name_from_the_dropdown_list(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the Rediness report",
  "keyword": "Then "
});
formatter.match({
  "location": "ReadinessReportStepDef.user_should_see_the_Rediness_report()"
});
formatter.result({
  "status": "skipped"
});
});