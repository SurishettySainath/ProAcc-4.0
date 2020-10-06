$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/IssueTrack/CreateIssue.feature");
formatter.feature({
  "name": "Creating Issue",
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
        "jc_PM",
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
  "name": "User enters jc_PM and b12345@",
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
  "name": "Creating Issue",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is in CREATE ISSUE page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should select Project name\u003cProjectNameforIssueTrack\u003e and Instance name\u003cInstanceNameforIssueTrack\u003e from the dropdown",
  "keyword": "When "
});
formatter.step({
  "name": "User should click on select instance button",
  "keyword": "And "
});
formatter.step({
  "name": "User should fill Issue Name\u003cIssueName\u003e,phase\u003cPhase\u003e,AssignedTo\u003cAssignedTo\u003e,Task\u003cTask\u003e and Comments\u003cComments\u003e and click on Create button",
  "keyword": "And "
});
formatter.step({
  "name": "User should able to Create Issue successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ProjectNameforIssueTrack",
        "InstanceNameforIssueTrack",
        "IssueName",
        "Phase",
        "AssignedTo",
        "Task",
        "Comments"
      ]
    },
    {
      "cells": [
        "jc Pilot Phase Test",
        "J12",
        "Test",
        "Assessment",
        "sai",
        "Accelerator",
        "Issue in progress"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating Issue",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is in CREATE ISSUE page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateIssue_StepDef.user_is_on_creating_Issue_track_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select Project namejc Pilot Phase Test and Instance nameJ12 from the dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "CreateIssue_StepDef.user_should_select_Project_name_and_Instance_name_from_the_dropdown(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on select instance button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateIssue_StepDef.user_should_click_on_select_instance_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should fill Issue NameTest,phaseAssessment,AssignedTosai,TaskAccelerator and CommentsIssue in progress and click on Create button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateIssue_StepDef.User_should_fill_Issue_Name_phase_AssignedTo_task_and_Comments(String,String,String,String,String)"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to select option by label \u0027sai\u0027 of object \u0027Object Repository/Pro_Acc_IssueTrack/select_AssignedTo\u0027  using regular expression\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByLabelKeyword.selectOptionByLabel(SelectOptionByLabelKeyword.groovy:98)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByLabelKeyword.execute(SelectOptionByLabelKeyword.groovy:71)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.selectOptionByLabel(WebUiBuiltInKeywords.groovy:1226)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$selectOptionByLabel$4.call(Unknown Source)\r\n\tat proAcc_Stepdef.CreateIssue_StepDef.User_should_fill_Issue_Name_phase_AssignedTo_task_and_Comments(CreateIssue_StepDef.groovy:166)\r\n\tat ✽.User should fill Issue NameTest,phaseAssessment,AssignedTosai,TaskAccelerator and CommentsIssue in progress and click on Create button(Include/features/proAcc_Featurefile/IssueTrack/CreateIssue.feature:27)\r\nCaused by: com.kms.katalon.core.exception.StepFailedException: No option matched.\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.stepFailed(KeywordMain.groovy:50)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.stepFailed(KeywordMain.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.stepFailed(KeywordMain.groovy:23)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByLabelKeyword$_selectOptionByLabel_closure1.doCall(SelectOptionByLabelKeyword.groovy:91)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByLabelKeyword$_selectOptionByLabel_closure1.call(SelectOptionByLabelKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByLabelKeyword.selectOptionByLabel(SelectOptionByLabelKeyword.groovy:98)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SelectOptionByLabelKeyword.execute(SelectOptionByLabelKeyword.groovy:71)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.selectOptionByLabel(WebUiBuiltInKeywords.groovy:1226)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$selectOptionByLabel$4.call(Unknown Source)\r\n\tat proAcc_Stepdef.CreateIssue_StepDef.User_should_fill_Issue_Name_phase_AssignedTo_task_and_Comments(CreateIssue_StepDef.groovy:166)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:105)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy:430)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:427)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:527)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner.call(Unknown Source)\r\n\tat TC_CreateIssue.run(TC_CreateIssue:20)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:339)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:330)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:309)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:301)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:235)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:191)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:141)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:90)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1601900557882.run(TempTestSuite1601900557882.groovy:39)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should able to Create Issue successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateIssue_StepDef.user_should_select_instance_successfully_for_Issue_Tracker()"
});
formatter.result({
  "status": "skipped"
});
});