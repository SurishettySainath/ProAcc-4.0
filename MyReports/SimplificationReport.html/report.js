$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Assessment/SimplificationReport.feature");
formatter.feature({
  "name": "SimplificationReport",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "SimplificationReport functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on SimplificationReport page",
  "keyword": "Given "
});
formatter.match({
  "location": "SimplificationReportStepDef.user_is_on_SimplificationReport_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke method createNode() on null object\r\n\tat org.codehaus.groovy.runtime.NullObject.invokeMethod(NullObject.java:91)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.call(PogoMetaClassSite.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.NullCallSite.call(NullCallSite.java:35)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\r\n\tat SimplificationReportStepDef.user_is_on_SimplificationReport_page(SimplificationReport_StepDef.groovy:97)\r\n\tat ✽.User is on SimplificationReport page(Include/features/proAcc_Featurefile/Assessment/SimplificationReport.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should select value from dropdownlist",
  "keyword": "When "
});
formatter.match({
  "location": "SimplificationReportStepDef.user_should_select_value_from_dropdownlist()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the Simplification report",
  "keyword": "Then "
});
formatter.match({
  "location": "SimplificationReportStepDef.user_should_see_the_Simplification_report()"
});
formatter.result({
  "status": "skipped"
});
});