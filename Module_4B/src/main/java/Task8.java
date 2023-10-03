import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chrome", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module_4B\\src\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(5000);

        //check if the submit button is enabled
        driver.findElement(By.cssSelector("#create")).click();
        boolean account = driver.findElement(By.cssSelector("#create")).isEnabled();
        System.out.println("Create account button is enabled before filling the form: " + account);

        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[id=firstName]")).sendKeys("Marie");

        driver.findElement(By.cssSelector("input[id=lastName]")).sendKeys("Doe");
        driver.findElement(By.cssSelector("input[id=email]")).sendKeys("mariedoe@gmail.com");
        driver.findElement(By.cssSelector("input[id=female]")).click();
        driver.findElement(By.cssSelector("input[id=password]")).sendKeys("Welcome123");
        driver.findElement(By.cssSelector("input[id=confirmPass]")).sendKeys("Welcome123");
        driver.findElement(By.cssSelector("input[id=xpLevel]")).sendKeys("I am software tester");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@id='create']")).click();
        boolean fields= driver.findElement(By.xpath("//button[@id='create']")).isEnabled();

        System.out.println("Create account button is enabled after the form field is filled: " + fields);







    }
}
