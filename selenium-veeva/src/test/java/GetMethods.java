import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        System.out.println("title"+driver.getTitle());
        System.out.println("CurrentUrl"+driver.getCurrentUrl());
        System.out.println("Page source"+driver.getPageSource());//returns source code of the page
        System.out.println("Window handle :"+driver.getWindowHandle());

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(3000);
        Set<String> ids=driver.getWindowHandles();
        for(String s:ids){
            System.out.println(s);
        }
        driver.close();
        Thread.sleep(3000);
        driver.quit();
    }
}
