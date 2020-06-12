import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleChrome {
    WebDriver driver;

    public void  setChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
    }

    public void openBrowser(){
        driver = new ChromeDriver();
    }

    public void openURL(String url){
        driver.get(url);
    }

    public String getTitle(){
        String returnTitle = driver.getTitle();
        return returnTitle;
    }

}
