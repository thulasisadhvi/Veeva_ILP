import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement user=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        user.sendKeys("tomsmith");

        WebElement pass=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"password\"]")));
        pass.sendKeys("SuperSecretPassword");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        System.out.println("login successfull");
        driver.quit();


    }
}
