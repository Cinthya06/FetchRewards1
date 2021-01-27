$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/basicFunctionality.feature");
formatter.feature({
  "name": "Search on Amazon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "searching for movies on amazon",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.step({
  "name": "user try to search for different \u003cmovies\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "movies"
      ]
    },
    {
      "cells": [
        "\"Titanic\""
      ]
    },
    {
      "cells": [
        "\"Shrek\""
      ]
    },
    {
      "cells": [
        "\"Cinderella\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "searching for movies on amazon",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user try to search for different \"Titanic\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "searching for movies on amazon",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user try to search for different \"Shrek\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "searching for movies on amazon",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user goes to amazon page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user try to search for different \"Cinderella\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});