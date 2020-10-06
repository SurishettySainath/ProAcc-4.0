$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/proAcc_Featurefile/User Settings/ViewCustomer.feature");
formatter.feature({
  "name": "View Customer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "View Customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate view customer page",
  "keyword": "Given "
});
formatter.step({
  "name": "User can search for the customer in customer search box\u003cCustomer_search\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User can see the created customer in the list\u003cCustomer_search\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Customer_search"
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
  "name": "View Customer",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User should be navigate view customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "ViewCustomer_StepDef.user_should_be_navigate_view_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can search for the customer in customer search boxjc Test",
  "keyword": "When "
});
formatter.match({
  "location": "ViewCustomer_StepDef.user_can_search_for_the_customer_in_customer_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see the created customer in the listjc Test",
  "keyword": "Then "
});
formatter.match({
  "location": "ViewCustomer_StepDef.user_can_see_the_created_customer_in_the_list(String)"
});
formatter.result({
  "status": "passed"
});
});