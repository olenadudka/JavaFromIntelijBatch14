package class21;

public class Browser {
    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void navigate(){
        System.out.println("opening the url");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("Close the browser");
    }
}
class Chrome extends Browser{
    void openBrowser(){
        System.out.println("opening the browser less than 1 sec");
    }
}
class FireFox{
    void openBrowser(){
        System.out.println("opening the browser less than 2 sec");
    }
}