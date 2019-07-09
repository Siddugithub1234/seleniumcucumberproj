$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/sk/dd.feature");
formatter.feature({
  "name": "To test the register for test me app",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid registration scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "url of testmeapp \"http://10.232.237.143:443/TestMeApp/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "csdd.url_of_testmeapp(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"\u003cuserame\u003e\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "csdd.user_enters_as_username(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#userName\"}\n  (Session info: chrome\u003d75.0.3770.100)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027BDC4-D-5RK2RG2\u0027, ip: \u002710.250.88.200\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_102\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 75.0.3770.100, chrome: {chromedriverVersion: 75.0.3770.90 (a6dcaf7e3ec6f..., userDataDir: C:\\Users\\A07208~1.26\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:56727}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: effc50abf41f547aed4e70ed62231cd9\n*** Element info: {Using\u003did, value\u003duserName}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat sk.csdd.user_enters_as_username(csdd.java:25)\r\n\tat ✽.user enters \"\u003cuserame\u003e\" as username(file:src/test/resources/sk/dd.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters \"\u003cfirstname\u003e\" as firstname",
  "keyword": "And "
});
formatter.match({
  "location": "csdd.user_enters_as_firstname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"\u003clastname\u003e\" as lastname",
  "keyword": "And "
});
formatter.match({
  "location": "csdd.user_enters_as_lastname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "csdd.user_enters_as_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters \"\u003cconfirmpassword\u003e\" as confirmpassword",
  "keyword": "And "
});
formatter.match({
  "location": "csdd.user_enters_as_confirmpassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Quit Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "csdd.quit_Browser()"
});
formatter.result({
  "status": "skipped"
});
});