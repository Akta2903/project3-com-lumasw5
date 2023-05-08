package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {



    By shoppingCart = By.xpath("//span[@class='base']");

    @CacheLookup
            @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
   //By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    @CacheLookup
            @FindBy(xpath = "//dd[contains(text(),'32')]")
            WebElement size;
   // By size = By.xpath("//dd[contains(text(),'32')]");

    @CacheLookup
            @FindBy(xpath = "//dd[contains(text(),'Black')]")
            WebElement color;
   // By color = By.xpath("//dd[contains(text(),'Black')]");

    @CacheLookup
            @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
            WebElement overNightDuffleText;
   // By overNightDuffleText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    @CacheLookup
            @FindBy(css = ".input-text.qty")
            WebElement qtyText;
    //By qtyText = By.cssSelector(".input-text.qty");

    @CacheLookup
            @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
            WebElement productPrice;
    //By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");

    @CacheLookup
            @FindBy(css = ".input-text.qty" )
            WebElement qty;
   // By qty = By.cssSelector(".input-text.qty");

    @CacheLookup
            @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
            WebElement updateShoppingCart;
    //By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

   @CacheLookup
           @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
           WebElement updatedProductPrice;
   // By updatedProductPrice=By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");



    public String getShoppingCart()
    {
        CustomListeners.test.log(Status.PASS,"Shopping Cart text is displayed on page");
        Reporter.log("Shopping Cart text is displayed on page");
        return getTextFromElement(shoppingCart);
    }
    public String getCronusYogaPantText()
    {
        CustomListeners.test.log(Status.PASS,"Cronus Yoga Pant  text is displayed on page");
        Reporter.log("Cronus Yoga Pant text is displayed on page");
        return getTextFromElement(cronusYogaPant);
    }
    public String getSizeText()
    {
        CustomListeners.test.log(Status.PASS," Size displayed on page " + size.toString());
        Reporter.log("Size displayed on page " + size.toString());
        return getTextFromElement(size);
    }
    public String getColorText()
    {
        CustomListeners.test.log(Status.PASS," Color displayed on page " + color.toString());
        Reporter.log("Color displayed on page " + color.toString());
        return getTextFromElement(color);
    }

    public String getOverNightDuffeleText()
    {
        CustomListeners.test.log(Status.PASS," Text displayed on page " + overNightDuffleText.toString());
        Reporter.log("Text displayed on page " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);
    }

    public String getQty()
    {
        CustomListeners.test.log(Status.PASS," Quantity displayed on page " + qtyText.toString());
        Reporter.log("Quantity displayed on page " + qtyText.toString());
       String q = qtyText.getAttribute("value");
        return q;
    }

    public String getProductPrice()
    {
        CustomListeners.test.log(Status.PASS," Price displayed on page " + productPrice.toString());
        Reporter.log("Price displayed on page " + productPrice.toString());
        return getTextFromElement(productPrice);
    }

    public void changeQtyOfOverNightDuffle(String newQty)
    {
        qty.clear();
        CustomListeners.test.log(Status.PASS," Quantity displayed on page " + newQty.toString());
        Reporter.log("Quantity displayed on page " + newQty.toString());
        sendTextToElement(qty,newQty);
    }
    public void clickOnUpdateShoppingCart()
    {
        CustomListeners.test.log(Status.PASS,"Click on Shopping Cart");
        Reporter.log("Click on Shopping Cart");
        clickOnElement(updateShoppingCart);
    }
    public String getUpdatedProductPrice()
    {
        CustomListeners.test.log(Status.PASS,"Updated Price displayed on Page " + updatedProductPrice.toString());
        Reporter.log("Updated Price displayed on Page " + updatedProductPrice.toString());
        return getTextFromElement(updatedProductPrice);
    }
}
