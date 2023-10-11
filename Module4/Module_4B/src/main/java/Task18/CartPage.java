package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage {
    WebDriver Cdriver = null;

    public CartPage (WebDriver driver){
        Cdriver = driver;
        PageFactory.initElements(Cdriver, this);
    }

    //confirm the product name
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement productName;
    public WebElement getProductName (){
        return  productName;

    }

    //click on the checkout button
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkout;
    public WebElement clickCheckout (){
        return  checkout;

    }



}
