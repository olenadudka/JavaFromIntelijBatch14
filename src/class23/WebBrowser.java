package class23;

public interface WebBrowser {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
     openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that
     implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebBrowser{

    @Override
    public void openBrowser() {
        System.out.println("Open Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in  Chrome");
    }
}
class FirefoxDriver implements WebBrowser{

    @Override
    public void openBrowser() {
        System.out.println("Open Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize window in Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in  Firefox");
    }
}