package seleniumPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumTest {

    public static void main(String[] args) {

        String root = System.getProperty("user.dir");

       String chromeDriverPath =  root + "\\drivers\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", chromeDriverPath);

       ChromeDriver driver = new ChromeDriver();
       driver.get("http://www.facebook.com");
       driver.quit();

    }





}
