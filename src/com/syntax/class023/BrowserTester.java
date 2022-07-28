package com.syntax.class023;

public class BrowserTester {
    public static void main(String[] args) {
      /*  WebDriver chrome=new Safari();
        chrome.startBrowser();
        chrome.openUrl("www.google.com");
        chrome.testLoginPage();
        chrome.closeBrowser();
*/
        WebDriver [] browsers={new Chrome(),new FireFox(),new Safari(),new FireFox()};

        for (WebDriver driver:browsers){

            driver.startBrowser();
            driver.openURL("www.google.com");
            driver.testLoginPage();
            driver.closeBrowser();
        }


    }
}
