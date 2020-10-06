$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/User Settings/CreateUser.feature");
formatter.feature({
  "name": "Create User Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create User Admin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be on create new user page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to fill the fields like Name\u003cName\u003e,LoginID\u003cLoginID\u003e,Password\u003cPassword\u003e,Confirmpassword\u003cConfirmpassword\u003e,Email\u003cEmail\u003e,Phonenumber\u003cPhonenumber\u003e,Usertype\u003cUsertype\u003e,Role\u003cRole\u003e,Customer\u003cCustomer\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on Create button",
  "keyword": "And "
});
formatter.step({
  "name": "User should successfully created new user",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "LoginID",
        "Password",
        "Confirmpassword",
        "Email",
        "Phonenumber",
        "Usertype",
        "Role",
        "Customer"
      ]
    },
    {
      "cells": [
        "jc_Admin",
        "GlobalVariable.useradmin",
        "GlobalVariable.passwordadmin",
        "GlobalVariable.passwordadmin",
        "Test@Promantus.com",
        "8976543210",
        "Admin",
        "",
        ""
      ]
    },
    {
      "cells": [
        "jc_PM",
        "GlobalVariable.userprojectmanager",
        "GlobalVariable.passwordprojectmanager",
        "GlobalVariable.passwordprojectmanager",
        "Test@Promantus.com",
        "8976543210",
        "Project Manager",
        "",
        ""
      ]
    },
    {
      "cells": [
        "jc_Consultant",
        "GlobalVariable.userconsultant",
        "GlobalVariable.passwordconsultant",
        "GlobalVariable.passwordconsultant",
        "Test@Promantus.com",
        "8976543210",
        "Consultant",
        "Functional",
        ""
      ]
    },
    {
      "cells": [
        "jc_Customer",
        "GlobalVariable.uc",
        "GlobalVariable.pc",
        "GlobalVariable.pc",
        "Test@Promantus.com",
        "8976543210",
        "Customer",
        "Functional",
        "jc Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create User Admin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be on create new user page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateUser_StepDef.user_should_be_on_create_new_user_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Namejc_Admin,LoginIDGlobalVariable.useradmin,PasswordGlobalVariable.passwordadmin,ConfirmpasswordGlobalVariable.passwordadmin,EmailTest@Promantus.com,Phonenumber8976543210,UsertypeAdmin,Role,Customer",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUser_StepDef.user_has_to_fill_the_fields_like(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Create button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUser_StepDef.User_has_to_click_on_Create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should successfully created new user",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUser_StepDef.user_should_successfully_created_new_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create User Admin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be on create new user page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateUser_StepDef.user_should_be_on_create_new_user_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Namejc_PM,LoginIDGlobalVariable.userprojectmanager,PasswordGlobalVariable.passwordprojectmanager,ConfirmpasswordGlobalVariable.passwordprojectmanager,EmailTest@Promantus.com,Phonenumber8976543210,UsertypeProject Manager,Role,Customer",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUser_StepDef.user_has_to_fill_the_fields_like(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Create button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUser_StepDef.User_has_to_click_on_Create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should successfully created new user",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUser_StepDef.user_should_successfully_created_new_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create User Admin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be on create new user page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateUser_StepDef.user_should_be_on_create_new_user_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Namejc_Consultant,LoginIDGlobalVariable.userconsultant,PasswordGlobalVariable.passwordconsultant,ConfirmpasswordGlobalVariable.passwordconsultant,EmailTest@Promantus.com,Phonenumber8976543210,UsertypeConsultant,RoleFunctional,Customer",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUser_StepDef.user_has_to_fill_the_fields_like(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Create button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUser_StepDef.User_has_to_click_on_Create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should successfully created new user",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUser_StepDef.user_should_successfully_created_new_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create User Admin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be on create new user page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateUser_StepDef.user_should_be_on_create_new_user_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to fill the fields like Namejc_Customer,LoginIDGlobalVariable.uc,PasswordGlobalVariable.pc,ConfirmpasswordGlobalVariable.pc,EmailTest@Promantus.com,Phonenumber8976543210,UsertypeCustomer,RoleFunctional,Customerjc Test",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUser_StepDef.user_has_to_fill_the_fields_like(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on Create button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUser_StepDef.User_has_to_click_on_Create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should successfully created new user",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUser_StepDef.user_should_successfully_created_new_user()"
});
formatter.result({
  "status": "passed"
});
});