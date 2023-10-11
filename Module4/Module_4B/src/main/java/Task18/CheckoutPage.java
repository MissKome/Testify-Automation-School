package Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver Fdriver = null;

    public CheckoutPage (WebDriver driver){
        Fdriver = driver;
        PageFactory.initElements(Fdriver, this);
    }

    //input lastname
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public WebElement getLastName(){
        return  lastName;

    }

    //input firstname
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public WebElement getFirstName(){
        return  firstName;

    }

    //input postal code
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    public WebElement getPostalCode(){
        return  postalCode;

    }

    //click on continue
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement clickContinue;
    public WebElement getClickContinue(){
        return  clickContinue;

    }

    //get the product name on the checkout overview page
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement checkoutName;
    public WebElement getCheckoutName(){
        return  checkoutName;


    }

}
