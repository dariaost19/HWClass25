package Homework19;

interface WebDriver {
    //Create a WebDriver Interface that will have the following unimplemented behaviour:
    // openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    // Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();


}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("You can open Browser in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("You  can close Browser in Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("You can Maximize the Window in Chrome ");
    }

    @Override
    public void findElement() {
        System.out.println("You can find element in Chrome");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("You can open Browser in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("You  can close Browser in FireFox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("You can Maximize the Window  in FireFox");
    }

    @Override
    public void findElement() {
        System.out.println("You can find element in FireFox");
    }
}

