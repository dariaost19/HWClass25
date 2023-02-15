package Homework19;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver []webDrivers={new ChromeDriver(),new FireFoxDriver()};
        for (WebDriver wd:webDrivers){
            wd.openBrowser();
            wd.closeBrowser();
            wd.maximizeWindow();
            wd.findElement();
        }
    }
}
