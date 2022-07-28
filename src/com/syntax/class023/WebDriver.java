package com.syntax.class023;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Start the browser");
    }
    public void openURL(String url){
        System.out.println("Opening "+url);
    }
    public void testLoginPage(){
        System.out.println("Checking if login page is visible");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }


}

class Chrome extends WebDriver{
    @Override
    public void startBrowser(){
        System.out.println("Start Google Chrome");
    }
    @Override
    public void openURL(String url){
        System.out.println("Opening the url "+url+" on Google Chrome");
    }
    @Override
    public void testLoginPage(){
        System.out.println("Testing the login page on Google Chrome");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing Google Chrome");
    }

}
class FireFox extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Start FireFox ");
    }

    @Override
    public void openURL(String url) {
        System.out.println("Opening the url " + url + " on FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox");
    }
}
    class Safari extends WebDriver {
        @Override
        public void startBrowser() {
            System.out.println("Start Safari ");
        }

        @Override
        public void openURL(String url) {
            System.out.println("Opening the url " + url + " on Safari");
        }

        @Override
        public void testLoginPage() {
            System.out.println("Testing the login page on Safari");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing Safari");
        }
    }

    class IE extends WebDriver {
        @Override
        public void startBrowser() {
            System.out.println("Start IE ");
        }

        @Override
        public void openURL(String url) {
            System.out.println("Opening the url " + url + " on IE");
        }

        @Override
        public void testLoginPage() {
            System.out.println("Testing the login page on IE");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing IE");
        }
    }

