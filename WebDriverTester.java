public class WebDriverTester {
    public static void main(String[] args) {
        remoteWebDriverInterface[] rWB = {new ChromeDriver(),new SafariDriver(), new FireFoxDriver()};
        for(remoteWebDriverInterface webDriver:rWB){
            webDriver.open();
            webDriver.close();
            webDriver.getTitle();
            webDriver.getScreenshot();
            webDriver.navigate();
        }
    }
}
