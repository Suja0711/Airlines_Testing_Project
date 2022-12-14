$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate login functionality of cebupacificair application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate login functionality of cebupacificair application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Loginfn"
    },
    {
      "name": "@AboutMenu"
    }
  ]
});
formatter.step({
  "name": "The user should launch cebupacificair website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_launch_cebupacificair_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pop up window should be closed",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.pop_up_window_should_be_closed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill the email and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_fill_the_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in valid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_valid_login_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca href\u003d\"javascript:void(0)\" class\u003d\"ng-star-inserted\"\u003e...\u003c/a\u003e is not clickable at point (768, 624). Other element would receive the click: \u003cdiv class\u003d\"loader-wrapper ng-tns-c0-0 ng-trigger ng-trigger-default ng-star-inserted ng-animating\" style\u003d\"\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d108.0.5359.99)\nBuild info: version: \u00274.0.0-alpha-2\u0027, revision: \u0027f148142cf8\u0027, time: \u00272019-07-01T20:55:26\u0027\nSystem info: host: \u0027DESKTOP-H5NOQRE\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.99, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\dell\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:61326}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 6edbdd415d1a8be1a813b7e56090ce1b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:308)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat org.utility.BaseClass.clickBtn(BaseClass.java:86)\r\n\tat org.stepdefinition.LoginSteps.the_user_should_be_in_valid_login_page(LoginSteps.java:70)\r\n\tat ✽.The user should be in valid login page(file:src/test/resources/Features/login.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/sitefeatrues.feature");
formatter.feature({
  "name": "To validate about menu functionality of cebupacificair application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AboutMenu"
    },
    {
      "name": "@Loginfn"
    }
  ]
});
formatter.scenario({
  "name": "To validate details about the website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AboutMenu"
    },
    {
      "name": "@Loginfn"
    }
  ]
});
formatter.step({
  "name": "The user has to click the About menu Our Story",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsFeature.the_user_has_to_click_the_About_menu_Our_Story()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the page to load",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.wait_for_the_page_to_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return to url \"https://www.cebupacificair.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.return_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate details about media center",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AboutMenu"
    },
    {
      "name": "@Loginfn"
    }
  ]
});
formatter.step({
  "name": "The user has to click the About menu Media Center",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsFeature.the_user_has_to_click_the_About_menu_Media_Center()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the page to load",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.wait_for_the_page_to_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return to url \"https://www.cebupacificair.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.return_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate details about connectivity",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AboutMenu"
    },
    {
      "name": "@Loginfn"
    }
  ]
});
formatter.step({
  "name": "The user has to click the About menu Talk to Us",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsFeature.the_user_has_to_click_the_About_menu_Talk_to_Us()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the page to load",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.wait_for_the_page_to_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return to url \"https://www.cebupacificair.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.return_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate details about Partners",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AboutMenu"
    },
    {
      "name": "@Loginfn"
    }
  ]
});
formatter.step({
  "name": "The user has to click the About menu Campaigns \u0026 Partners",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsFeature.the_user_has_to_click_the_About_menu_Campaigns_Partners()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the page to load",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.wait_for_the_page_to_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return to url \"https://www.cebupacificair.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.return_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate details about CompanyInfo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AboutMenu"
    },
    {
      "name": "@Loginfn"
    }
  ]
});
formatter.step({
  "name": "The user has to click the About menu Company Information",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsFeature.the_user_has_to_click_the_About_menu_Company_Information()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.stepdefinition.StepsFeature.the_user_has_to_click_the_About_menu_Company_Information(StepsFeature.java:66)\r\n\tat ✽.The user has to click the About menu Company Information(file:src/test/resources/Features/sitefeatrues.feature:26)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Wait for the page to load",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.wait_for_the_page_to_load()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Return to url \"https://www.cebupacificair.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.return_to_url(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate details about Carrers",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AboutMenu"
    },
    {
      "name": "@Loginfn"
    }
  ]
});
formatter.step({
  "name": "The user has to click the About menu Careers",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsFeature.the_user_has_to_click_the_About_menu_Careers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the page to load",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.wait_for_the_page_to_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return to url \"https://www.cebupacificair.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ManagemodSteps.return_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});