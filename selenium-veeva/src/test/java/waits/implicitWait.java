package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitWait {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement user=driver.findElement(By.id("username"));
        user.sendKeys("tomsmith");
        System.out.println("username : "+user.getAttribute("value"));

        WebElement pass= driver.findElement(By.xpath("//input[@id=\"password\"]"));
        pass.sendKeys("SuperSecretPassword");
        System.out.println("password : "+pass.getAttribute("value"));

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Login completed");

        driver.quit();
    }
}
