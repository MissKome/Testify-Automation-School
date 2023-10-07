import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chrome", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //navigate to url
        driver.get("https://jqueryui.com/ ");
        Thread.sleep(5000);
        //scroll down on the page
        JavascriptExecutor js  = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(5000);
        //click on dialog
        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        Thread.sleep(5000);
        //switch into iframe
       WebElement iframe = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        driver.switchTo().frame(iframe);
        //click on the close button
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/button[1]/span[1]")).click();




    }
}
