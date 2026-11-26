package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;


public class Fluentwait {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        FluentWait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement username=wait.until(d->{
            WebElement element=d.findElement(By.id("username"));
            if(element.isDisplayed()){
                return element;
            }
            return null;
        });
        username.sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("login sucessfull");
        driver.quit();
    }
}
