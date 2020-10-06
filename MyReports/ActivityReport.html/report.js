$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Assessment/ActivityReport.feature");
formatter.feature({
  "name": "ActivityReport",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "ActivityReport functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on ActivityReport page",
  "keyword": "Given "
});
formatter.match({
  "location": "ActivityReportStepDef.user_is_on_ActivityReport_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke method createNode() on null object\r\n\tat org.codehaus.groovy.runtime.NullObject.invokeMethod(NullObject.java:91)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.call(PogoMetaClassSite.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.NullCallSite.call(NullCallSite.java:35)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\r\n\tat ActivityReportStepDef.user_is_on_ActivityReport_page(ActivityReport_StepDef.groovy:98)\r\n\tat ✽.User is on ActivityReport page(Include/features/proAcc_Featurefile/Assessment/ActivityReport.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should select by phase and by condition values from dropdownlist",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityReportStepDef.user_should_select_by_phase_and_by_condition_values_from_dropdownlist()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the ActivityReport",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityReportStepDef.user_should_see_the_ActivityReport()"
});
formatter.result({
  "status": "skipped"
});
});