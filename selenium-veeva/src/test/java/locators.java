import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();

        //id-locator
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        //id-"login-button",name-"login-button"

        //name- locator
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(2000);
        System.out.println("=========LoginSuccessfull=========");

        //classname- locator
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);

        //name-locator
        driver.findElement(By.name("continue-shopping")).click();
        Thread.sleep(2000);

        //classname- locator
        List< WebElement> Totalproducts=driver.findElements(By.className("inventory_item"));
        System.out.println("totalproducts id"+Totalproducts.size());

        //tagname -locator
        List<WebElement> Totalimages=driver.findElements(By.tagName("img"));
        System.out.println("Totalimages "+Totalimages.size());

        List<WebElement> products=driver.findElements(By.className("inventory_item_name"));
        System.out.println("==========products==========");
        for (WebElement product : products) {
            System.out.println(product.getText());
        }

        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);

        //linktext -locator
        driver.findElement(By.linkText("All Items")).click();

        //partiallinktest -locator
        driver.findElement(By.partialLinkText("Logou")).click();
        Thread.sleep(3000);

        driver.quit();

    }
}
