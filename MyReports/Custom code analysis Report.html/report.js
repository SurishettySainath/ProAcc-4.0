$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Assessment/Custom code analysis.feature");
formatter.feature({
  "name": "Custom code analysis",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Custom code analysis functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on Custom code analysis page",
  "keyword": "Given "
});
formatter.match({
  "location": "CustomCodeAnalysisStepDef.user_is_on_Custom_code_analysis_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke method createNode() on null object\r\n\tat org.codehaus.groovy.runtime.NullObject.invokeMethod(NullObject.java:91)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaClassSite.call(PogoMetaClassSite.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.NullCallSite.call(NullCallSite.java:35)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\r\n\tat CustomCodeAnalysisStepDef.user_is_on_Custom_code_analysis_page(CustomCodeAnalysis_StepDef.groovy:96)\r\n\tat ✽.User is on Custom code analysis page(Include/features/proAcc_Featurefile/Assessment/Custom code analysis.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should see Custom code analysis table",
  "keyword": "When "
});
formatter.match({
  "location": "CustomCodeAnalysisStepDef.user_should_see_Custom_code_analysis_table()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can see the custom code analysis report generated successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomCodeAnalysisStepDef.user_can_see_the_report()"
});
formatter.result({
  "status": "skipped"
});
});