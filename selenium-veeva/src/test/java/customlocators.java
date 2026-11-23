import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class customlocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();

        //login
        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        System.out.println("username : "+ username.getAttribute("value"));

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        System.out.println("password : "+ password.getAttribute("value"));

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);

        System.out.println("=============login sucessfull=============");

        // add to cart
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        String prod1=driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']")).getText();
        System.out.println("product added :"+prod1);
        driver.findElement(By.xpath("//button[@name=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        String prod2=driver.findElement(By.xpath("//div[contains(text(),'Bike')]")).getText();
        System.out.println("product added :"+prod2);
        driver.findElement(By.xpath("//button[@name=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
        String prod3=driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']")).getText();
        System.out.println("product added :"+prod3);
        driver.findElement(By.xpath("//button[@data-test=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
        String prod4=driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']")).getText();
        System.out.println("product added :"+ prod4);

        //remove from cart
        driver.findElement(By.xpath("//button[@name=\"remove-sauce-labs-fleece-jacket\"]")).click();
        String prod=driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']")).getText();
        System.out.println("product removed :"+prod);

        //checkout

        driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        driver.findElement(By.xpath("//button[@name=\"checkout\"]")).click();
        System.out.println("==========check out==========");

        Thread.sleep(2000);
        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Sadhvi");
        System.out.println("first name :"+firstname.getAttribute("value"));
        WebElement lastname=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
        lastname.sendKeys("Chodapuneedi");
        System.out.println("last name :"+lastname.getAttribute("value"));
        WebElement zipcode=driver.findElement(By.xpath("//input[@data-test=\"postalCode\"]"));
        zipcode.sendKeys("533462");
        System.out.println("zipcode :"+zipcode.getAttribute("value"));

        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(2000);
        //details
        System.out.println("==========price infoo==========");
        System.out.println("items price :"+driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText());
        System.out.println("tax price :"+driver.findElement(By.xpath("//div[@class='summary_tax_label']")).getText());
        System.out.println("total price :"+driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText());

        driver.findElement(By.xpath("//button[@id='finish']")).click();
        System.out.println("==========order placed successfully==========");
        Thread.sleep(2000);


        driver.findElement(By.xpath("//button[@id=\"generate-pdf-order\"]")).click();
        System.out.println("==========pdf generated successfully==========");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@name=\"back-to-products\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

        System.out.println("==========logged out successfully==========");

        driver.quit();

        /* output
username : standard_user
password : secret_sauce
=============login sucessfull=============
product added :Sauce Labs Backpack
product added :Sauce Labs Bike Light
product added :Sauce Labs Bolt T-Shirt
product added :Sauce Labs Fleece Jacket
product removed :Sauce Labs Fleece Jacket
==========check out==========
first name :Sadhvi
last name :Chodapuneedi
zipcode :533462
==========price infoo==========
items price :Item total: $55.97
tax price :Tax: $4.48
total price :Item total: $55.97
==========order placed successfully==========
==========pdf generated successfully==========
==========logged out successfully==========

         */

    }
}
