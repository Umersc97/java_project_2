public interface WebDriver {

    void open();
    void close();
    String getTitle();
}

interface takesScreenshot {
    void getScreenshot();
}

interface remoteWebDriverInterface extends takesScreenshot, WebDriver{
    void navigate();
}

class ChromeDriver implements remoteWebDriverInterface{
    @Override
    public void open(){
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close(){
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle(){
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take Screenshot in Chrome Browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome Browser");
    }
}

class SafariDriver implements remoteWebDriverInterface{
    @Override
    public void open(){
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close(){
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle(){
        return null;
    }
    @Override
    public void getScreenshot() {
        System.out.println("Take Screenshot in Safari Browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari Browser");
    }
}

class FireFoxDriver implements remoteWebDriverInterface{
    @Override
    public void open(){
        System.out.println("Open FireFox Browser");
    }

    @Override
    public void close(){
        System.out.println("Close FireFox Browser");
    }

    @Override
    public String getTitle(){
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take Screenshot in FireFox Browser");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to FirFox Browser");
    }
}


