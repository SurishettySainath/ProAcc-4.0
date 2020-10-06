$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/Deletion/Customer_Delete.feature");
formatter.feature({
  "name": "User deletion",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User deletion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Customerlist page",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter customername\u003ccustomername\u003e in search box",
  "keyword": "When "
});
formatter.step({
  "name": "User has to click on delete button for customer",
  "keyword": "And "
});
formatter.step({
  "name": "User has successfully deleted customer",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "customername"
      ]
    },
    {
      "cells": [
        "jc Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User deletion",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should navigate to Customerlist page",
  "keyword": "Given "
});
formatter.match({
  "location": "Customer_Delete.user_should_navigate_to_Customerlist_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter customernamejc Test in search box",
  "keyword": "When "
});
formatter.match({
  "location": "Customer_Delete.user_has_to_enter_customername_in_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click on delete button for customer",
  "keyword": "And "
});
formatter.match({
  "location": "Customer_Delete.user_has_to_click_on_delete_button_for_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has successfully deleted customer",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer_Delete.user_has_successfully_deleted_customer()"
});
formatter.result({
  "status": "passed"
});
});