package Task19.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageSauce {
    WebDriver Bdriver = null;

    public ProductPageSauce (WebDriver driver){
        Bdriver = driver;
        PageFactory.initElements(Bdriver, this);
    }

    //get the text name of the product to be added to cart
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")
    private WebElement name;
    public WebElement getName(){
        return  name;


    }


    //click on add to cart
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement product;
    public WebElement getProduct(){
        return  product;


    }

    //click on the shopping cart link
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cartLink;
    public WebElement getCartLink(){
        return  cartLink;


    }
}
