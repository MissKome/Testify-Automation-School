package Task19.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageSauce {
    WebDriver Cdriver = null;

    public CartPageSauce (WebDriver driver){
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
