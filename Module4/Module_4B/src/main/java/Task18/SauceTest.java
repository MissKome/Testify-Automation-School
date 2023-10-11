package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceTest {
    WebDriver driver = null;

    @Test
    public void SauceTest(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Windows 10 Pro\\IdeaProjects\\Testify-Automation-School\\Module4\\Module_4B\\src\\edgedriver_win64\\msedgedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

         //login page
        LoginPage login = new LoginPage(driver);
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.login().click();

        //product page
        ProductPage product = new ProductPage(driver);
        String prodName = product.getName().getText();
        System.out.println("This is the product I have selected: " + prodName);
        product.getProduct().click();
        product.getCartLink().click();

        System.out.println("    ");

        //cart page
        CartPage cart = new CartPage(driver);
       String productName = cart.getProductName().getText();
       Assert.assertEquals(productName, prodName);
        System.out.println("The product added to cart is as expected");
       cart.clickCheckout().click();

        System.out.println("    ");

       //checkout page
       CheckoutPage checkout = new CheckoutPage(driver);
       checkout.getFirstName().sendKeys("Mary");
       checkout.getLastName().sendKeys("Doe");
       checkout.getPostalCode().sendKeys("100252");
       checkout.getClickContinue().click();
       String proName = checkout.getCheckoutName().getText();
       Assert.assertEquals(proName, prodName);
        System.out.println("The product on the checkout page, is as expected");

        System.out.println("    ");

        //finish page
       FinishPage finish = new FinishPage(driver);
       finish.getFinish().click();
       String successMessage = finish.getSuccess().getText();
       Assert.assertEquals(successMessage, "Thank you for your order!");
        System.out.println(successMessage +  " is as expected");







    }


}
