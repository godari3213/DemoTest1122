$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Refund of item",
  "description": "",
  "id": "refund-of-item",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 44,
  "name": "large data",
  "description": "",
  "id": "refund-of-item;large-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@dataTest"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "the following users exists",
  "rows": [
    {
      "cells": [
        "name",
        "email"
      ],
      "line": 46
    },
    {
      "cells": [
        "abc",
        "ab99c@gmail.com"
      ],
      "line": 47
    },
    {
      "cells": [
        "fgrr",
        "ghdjfhemail@gmail"
      ],
      "line": 48
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Testlogin.the_following_users_exists(DataTable)"
});
formatter.result({
  "duration": 181206825,
  "status": "passed"
});
});