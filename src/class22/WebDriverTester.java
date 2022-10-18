package class22;

public class WebDriverTester {
    public static void main(String[] args) {
       Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();

        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();

        Firefox firefox=new Firefox();
        firefox.startBrowser();
        firefox.test();
        firefox.closeBrowser();

      /*  Safari safari=new Safari();
        Chrome chrome=new Chrome();
        Firefox firefox=new Firefox();
        WebDriver[] browsers={chrome,safari,firefox,new Firefox(),new Safari};*/

        /*
        Creating objects of all Child classes and storing them in an Array of type Webdriver
         we can do this because upcasting allows us to do this
         */

        WebDriver[] browsers={new Chrome(), new Safari(), new Firefox()};
        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }

        for (int i=0; i<browsers.length;i++){
            browsers[i].startBrowser();
           browsers[i].test();
            browsers[i].closeBrowser();}

        }
    }


