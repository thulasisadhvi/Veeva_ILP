package customlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// css Selector

public class csscustomLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();

        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input.submit-button")).click();
        Thread.sleep(2000);
        System.out.println("=========LoginSuccessfull=========");

        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button.btn[data-test=\"continue-shopping\"]")).click();
        Thread.sleep(2000);


        driver.findElement(By.cssSelector("button#react-burger-menu-btn")).click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("a.bm-item[data-test=\"logout-sidebar-link\"]")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
