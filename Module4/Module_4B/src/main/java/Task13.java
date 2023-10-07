import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chrome", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//navigate to url
        driver.navigate().to("https://selenium08.blogspot.com/");
        Thread.sleep(5000);
        //click on search
        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();

        //search for demo drop down
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
        Actions keys = new Actions(driver);
        keys.sendKeys("Demo dropdown").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);

         // click on read more
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[4]/div[2]/a[1]")).click();

        //scroll down
        JavascriptExecutor js  = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");

        //select country
        WebElement selectCountry = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
        Select select = new Select(selectCountry);
        Thread.sleep(3000);
        select.selectByValue("NG");

        //select month
        WebElement selectMonth = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));
        Select select1 = new Select(selectMonth);
        Thread.sleep(3000);
        select1.selectByIndex(1);
        select1.selectByIndex(2);
        select1.selectByIndex(3);






    }
}
