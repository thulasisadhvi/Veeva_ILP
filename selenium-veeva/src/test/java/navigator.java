import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class navigator {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver=new ChromeDriver();
        //it accepts both string and url object
        URL url=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to(url);
        driver.navigate().to("https://www.saucedemo.com/");

        driver.navigate().back();
        System.out.println("current url "+driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println("current url "+driver.getCurrentUrl());

        driver.quit();//quit all windows in this session


    }
}
