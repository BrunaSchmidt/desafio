package challenge.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public WebDriver driver = new ChromeDriver();

    public void PreCondition(){

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
    }

    public void PosCondition(){

        driver.quit();

    }

}
