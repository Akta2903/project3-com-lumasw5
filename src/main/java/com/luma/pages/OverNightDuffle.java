package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OverNightDuffle extends Utility {

   @CacheLookup
   @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;
   // By overNightDuffleText = By.xpath("//span[@class='base']");

    @CacheLookup
            @FindBy(xpath = "//input[@id='qty']")
            WebElement qty;
    //By qty = By.xpath("//input[@id='qty']");

    @CacheLookup
            @FindBy(xpath = "//button[@id='product-addtocart-button']")
            WebElement addToCart;
   // By addToCart = By.xpath("//button[@id='product-addtocart-button']");

    @CacheLookup
            @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
            WebElement addToCartText;
    //By addToCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    //By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public String getOverNightDuffelText()
    {
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQuantityTo3(String newQty)
    {
       // driver.findElement(qty).clear();

        qty.clear();
        Reporter.log("Enter the qty : " + newQty);
        CustomListeners.test.log(Status.PASS,"Enter the qty :" + newQty);
        sendTextToElement(qty,newQty);

    }

    public void clickOnAddToCart()
    {
        CustomListeners.test.log(Status.PASS,"Click on Add Cart");
        Reporter.log("Click on Add To Cart");
        clickOnElement(addToCart);
    }

    public String getAddToCartText()
    {
        CustomListeners.test.log(Status.PASS,"Add To Cart text is displayed on page");
        Reporter.log("Add To Cart text is displayed on page");
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart()
    {
        CustomListeners.test.log(Status.PASS,"Click on Shopping Cart");
        Reporter.log("Click on Shopping Cart");
        clickOnElement(shoppingCart);
    }
}
