package class23;

public class WebBrowserTest {
    public static void main(String[] args) {


        WebBrowser[] browser = {new ChromeDriver(), new FirefoxDriver()};
        for (WebBrowser br : browser) {
br.openBrowser();
br.closeBrowser();
br.findElement();
br.maximizeWindow();
        }
    }
}