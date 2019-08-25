$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/FacebookInvalidTest.feature");
formatter.feature({
  "line": 2,
  "name": "Facebook signin",
  "description": "",
  "id": "facebook-signin",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Facebook"
    }
  ]
});
formatter.before({
  "duration": 15845724180,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "valid google login",
  "description": "",
  "id": "facebook-signin;valid-google-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Facebook"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "enter fcebook invalidusername",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "enter facebook invalidpassword",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Then click on facebook  invalidlogin"
    }
  ],
  "line": 10,
  "name": "US124 Enter the first name",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidFacebookLogin_StepDef.setup()"
});
formatter.result({
  "duration": 412229400,
  "status": "passed"
});
formatter.match({
  "location": "InvalidFacebookLogin_StepDef.enterUserName()"
});
formatter.result({
  "duration": 9385186240,
  "status": "passed"
});
formatter.match({
  "location": "InvalidFacebookLogin_StepDef.EnterthefirstUesrname()"
});
formatter.result({
  "duration": 9606195533,
  "status": "passed"
});
formatter.after({
  "duration": 159285,
  "status": "passed"
});
formatter.after({
  "duration": 1303048914,
  "status": "passed"
});
});