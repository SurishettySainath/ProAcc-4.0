$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Assessment/FioriAppReport.feature");
formatter.feature({
  "name": "FioriApp Report",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "FioriApp Report functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on FioriApp Report page",
  "keyword": "Given "
});
formatter.match({
  "location": "FioriAppsReportStepDef.user_is_on_FioriApp_Report_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke method createNode() on null object\r\n\tat org.codehaus.groovy.runtime.NullObject.invokeMethod(NullObject.java:91)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.call(PogoMetaClassSite.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.NullCallSite.call(NullCallSite.java:35)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\r\n\tat FioriAppsReportStepDef.user_is_on_FioriApp_Report_page(FioriAppsReport_StepDef.groovy:96)\r\n\tat ✽.User is on FioriApp Report page(Include/features/proAcc_Featurefile/Assessment/FioriAppReport.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should select value from dropdownlist of FioriApps report",
  "keyword": "When "
});
formatter.match({
  "location": "FioriAppsReportStepDef.user_should_select_value_from_dropdownlist_of_FioriApps_report()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the FioriApp Report",
  "keyword": "Then "
});
formatter.match({
  "location": "FioriAppsReportStepDef.user_should_see_the_FioriApp_Report()"
});
formatter.result({
  "status": "skipped"
});
});