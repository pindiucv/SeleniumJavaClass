package homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstHw {

    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");

        String chromeDriverPath =  dir + "\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");

        //Verifying the title

        String pageTitle = driver.getTitle();
        if (pageTitle.equalsIgnoreCase("Facebook - Log In or Sign Up")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is incorect");
        }

        //Getting the page source
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Curent URL IS: " + currentUrl);

        //Getting page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource);

        driver.quit();
    }




}
