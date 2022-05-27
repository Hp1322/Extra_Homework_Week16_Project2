$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshopping.feature");
formatter.feature({
  "line": 2,
  "name": "Create account Test",
  "description": "As a User I want to create account in automation website",
  "id": "create-account-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15899048700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "TC-003 Add product to Online Cart and checkout",
  "description": "",
  "id": "create-account-test;tc-003-add-product-to-online-cart-and-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@test03"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I add below product to cart",
  "rows": [
    {
      "comments": [
        {
          "line": 21,
          "value": "#          | category | subCategory    | name                        | model  | quantity |"
        }
      ],
      "cells": [
        "Dresses",
        "CASUAL DRESSES",
        "Printed Dress",
        "demo_3",
        "2"
      ],
      "line": 22
    },
    {
      "cells": [
        "Women",
        "TOPS",
        "Faded Short Sleeve T-shirts",
        "demo_1",
        "3"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I shall validate shopping cart as below",
  "rows": [
    {
      "comments": [
        {
          "line": 25,
          "value": "#          | name                        | model        | quantity |"
        }
      ],
      "cells": [
        "Printed Dress",
        "SKU : demo_3",
        "2"
      ],
      "line": 26
    },
    {
      "cells": [
        "Faded Short Sleeve T-shirts",
        "SKU : demo_1",
        "3"
      ],
      "line": 27
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I shall be able to Buy the product",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I shall be able to Buy using cheque payment",
  "keyword": "And "
});
formatter.match({
  "location": "OnlineShoppingTest.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 8083874900,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingTest.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 5975055200,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingTest.iAddBelowProductToCart(DataTable)"
});
formatter.result({
  "duration": 28585336100,
  "status": "passed"
});
formatter.match({
  "location": "OnlineShoppingTest.iShallValidateShoppingCartAsBelow(DataTable)"
});
formatter.result({
  "duration": 35087511900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//tbody/tr[2]/td[2]/p\"}\n  (Session info: chrome\u003d102.0.5005.61)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027LAPTOP-JDV84NQN\u0027, ip: \u0027192.168.1.94\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [86cfcbda75a761ddc17959c8644dfe8c, findElement {using\u003dxpath, value\u003d//tbody/tr[2]/td[2]/p}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.61, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\harsh\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56108}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:56108/devtoo..., se:cdpVersion: 102.0.5005.61, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 86cfcbda75a761ddc17959c8644dfe8c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.getText(Unknown Source)\r\n\tat com.automation.utility.Utility.getTextFromElement(Utility.java:73)\r\n\tat com.automation.pages.CommonPage.getNameText(CommonPage.java:92)\r\n\tat com.automation.steps.OnlineShoppingTest.iShallValidateShoppingCartAsBelow(OnlineShoppingTest.java:106)\r\n\tat ✽.Then I shall validate shopping cart as below(onlineshopping.feature:24)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OnlineShoppingTest.iShallBeAbleToBuyTheProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OnlineShoppingTest.iShallBeAbleToBuyUsingChequePayment()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 409129500,
  "status": "passed"
});
});