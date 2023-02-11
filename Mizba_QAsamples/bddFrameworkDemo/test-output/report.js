$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/login.feature");
formatter.feature({
  "name": "AmazonLogin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login functionality Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user opens url \"http://amazon.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_opens_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on signin button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_click_on_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email as \"mizba24@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter password as \"Ayaan.21\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page url should be \"https://www.amazon.com/?ref_\u003dnav_ya_signin\u0026\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.page_url_should_be(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ps://www.amazon.com/[?ref_\u003dnav_ya_signin\u0026]\u003e but was:\u003c...ps://www.amazon.com/[ap/signin]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat stepDefnitions.steps.page_url_should_be(steps.java:67)\r\n\tat ✽.page url should be \"https://www.amazon.com/?ref_\u003dnav_ya_signin\u0026\"(file:Features/login.feature:10)\r\n",
  "status": "failed"
});
});