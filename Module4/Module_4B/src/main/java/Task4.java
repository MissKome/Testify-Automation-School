import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module4\\Module4B\\Task4\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/");

        driver.findElement(By.linkText("Security Project")).click();
        driver.findElement(By.name("uid")).sendKeys("Mary");
        driver.findElement(By.name("password")).sendKeys("Welcome123@");
    }
}
//        This element is in iframe - //span[@class='ns-lbx6q-e-16']

