$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "when title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 7584373436,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.when_title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 11190645,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 425079868,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 2315528890,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_homepage()"
});
formatter.result({
  "duration": 6234970,
  "status": "passed"
});
});