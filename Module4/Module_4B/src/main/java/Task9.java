import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chrome", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//navigate to url
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(5000);
//input username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(5000);
//login
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(5000);
//navigate back to the login page
        driver.navigate().back();
        Thread.sleep(5000);
//printout the login attribute
        System.out.println("Login button attribute: " + driver.findElement(By.cssSelector("#login-button")).getAttribute("value"));
        Thread.sleep(5000);
//navigate forward to the home page
        driver.navigate().forward();
        Thread.sleep(5000);
//printout the name of a product
        System.out.println("Name of product: " + driver.findElement(By.cssSelector("a[id=item_4_title_link]")).getText());

    }
}
