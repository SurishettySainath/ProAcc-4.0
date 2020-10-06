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
        "Alexa Pilot Phase Test",
        "P01",
        "3",
        "5",
        "Work In Progress"
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
  "status": "passed"
});
formatter.step({
  "name": "User has to select Project NameAlexa Pilot Phase Test and Instance NameP01 from the dropdown for project Assessment Monitor",
  "keyword": "When "
});
formatter.match({
  "location": "AssessmentMonitorforPM_StepDef.user_has_to_select_Project_Name_and_Instance_Name_from_the_dropdown_for_project_Assessment_Monitor(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on select instance button for PMAssessment Monitor",
  "keyword": "And "
});
formatter.match({
  "location": "AssessmentMonitorforPM_StepDef.user_has_to_click_on_select_instance_button_for_PMAssessment_Monitor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to edit task3,5,Work In Progress for project manager",
  "keyword": "And "
});
formatter.match({
  "location": "AssessmentMonitorforPM_StepDef.user_has_to_edit_task(String,String,String)"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to scroll to object\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword.scrollToElement(ScrollToElementKeyword.groovy:88)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword.execute(ScrollToElementKeyword.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.scrollToElement(WebUiBuiltInKeywords.groovy:3001)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$scrollToElement$8.call(Unknown Source)\r\n\tat proAcc_Stepdef.AssessmentMonitorforPM_StepDef.user_has_to_edit_task(AssessmentMonitorforPM_StepDef.groovy:160)\r\n\tat ✽.User has to edit task3,5,Work In Progress for project manager(Include/features/proAcc_Featurefile/Assessment/AssessmentMoniterforPM.feature:16)\r\nCaused by: java.lang.IllegalArgumentException: Object is null\r\n\tat com.kms.katalon.core.helper.KeywordHelper.checkTestObjectParameter(KeywordHelper.java:33)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword$_scrollToElement_closure1.doCall(ScrollToElementKeyword.groovy:76)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword$_scrollToElement_closure1.call(ScrollToElementKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword.scrollToElement(ScrollToElementKeyword.groovy:88)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ScrollToElementKeyword.execute(ScrollToElementKeyword.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.scrollToElement(WebUiBuiltInKeywords.groovy:3001)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$scrollToElement$8.call(Unknown Source)\r\n\tat proAcc_Stepdef.AssessmentMonitorforPM_StepDef.user_has_to_edit_task(AssessmentMonitorforPM_StepDef.groovy:160)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:105)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy:430)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:427)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:527)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner.call(Unknown Source)\r\n\tat TC_AssessmentMonitorforPM.run(TC_AssessmentMonitorforPM:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:337)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:328)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:307)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:299)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:233)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:169)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:142)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:91)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1594190687250.run(TempTestSuite1594190687250.groovy:37)\r\n",
  "status": "failed"
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