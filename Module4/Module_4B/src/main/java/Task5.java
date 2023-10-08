import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module4\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //navigate to the browser
        driver.get("https://www.saucedemo.com/ ");

        //input the username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(5000);
        //input the password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        //click on the login button
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(5000);
        //click on the add to cart button
        driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(5000);
        //click on the cart icon
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        Thread.sleep(5000);
        //click on the checkout button
        driver.findElement(By.xpath("//button[@name='checkout']")).click();

        //driver.close();

    }
}

