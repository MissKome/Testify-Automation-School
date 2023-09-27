import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module4\\Module4B\\Task6\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//navigate to the browser
        driver.get("https://www.saucedemo.com/");

        //input username
driver.findElement(By.cssSelector("input#user-name")) .sendKeys("standard_user");
Thread.sleep(5000);

        //input password
        driver.findElement(By.cssSelector("input[placeholder^=\"Pass\"] ")).sendKeys("secret_sauce");
        Thread.sleep(5000);

        //click on the login button
        driver.findElement(By.cssSelector("input[name=\"login-button\"]")).click();
        Thread.sleep(5000);

        //add to cart
        driver.findElement(By.cssSelector("button[data-test$=\"light\"] ")).click();
        Thread.sleep(5000);

        //click on the cart icon
        driver.findElement(By.cssSelector("a[class = shopping_cart_link]")).click();
        Thread.sleep(5000);

        //click on check out
        driver.findElement(By.cssSelector("button[name^=\"check\"]  ")).click();
    }
}
