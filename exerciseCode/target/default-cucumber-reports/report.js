$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/goldBars.feature");
formatter.feature({
  "name": "Weighing Function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User finds fake bar",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Weigh"
    }
  ]
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User inputs value in left box",
  "keyword": "When "
});
formatter.match({
  "location": "WeighStepDefs.user_inputs_value_in_left_box()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User compares Values",
  "keyword": "And "
});
formatter.match({
  "location": "WeighStepDefs.user_compares_Values()"
});
formatter.result({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "User verifies fake Bar",
  "keyword": "Then "
});
formatter.match({
  "location": "WeighStepDefs.user_verifies_fake_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});