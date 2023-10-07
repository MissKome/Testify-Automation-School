import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chrome", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to url
        driver.get("https://jqueryui.com/");

        driver.findElement(By.xpath("//a[normalize-space()='Resizable']")).click();

        driver.switchTo().frame(0);

        WebElement resizeBox = driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
        Actions action = new Actions(driver);
        Thread.sleep(5000);

        action.clickAndHold(resizeBox).moveByOffset(326, 223).release().perform();

    }
}
