 Feature: AmazonLogin
 Scenario: Login functionality Test
 Given user launch chrome browser
 When user opens url "http://amazon.com"
 And user click on signin button
 And user enter email as "mizba24@gmail.com"
 And user click on continue button
 And user enter password as "Ayaan.21"
 And user click on Login button
 Then page url should be "https://www.amazon.com/?ref_=nav_ya_signin&"
 