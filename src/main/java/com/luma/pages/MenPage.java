package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement color;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    public void mouseHoverOnCronusYogaPant()
    {
        Reporter.log("Mouse hover on cronus Yoga Pant");
        CustomListeners.test.log(Status.PASS,"Mouse hover on cronus Yoga Pant");
        mouseHoverToElement(cronusYogaPant);
    }

    public void clickOnSize()
    {
        CustomListeners.test.log(Status.PASS,"Click on size");
        Reporter.log("Click on size");
        clickOnElement(size);
    }

    public void clickOnColor()
    {
        CustomListeners.test.log(Status.PASS,"Click on color");
        Reporter.log("Click on color");
        clickOnElement(color);
    }

    public void clickOnAddToCart()
    {
        CustomListeners.test.log(Status.PASS,"Click on AddToCart");
        Reporter.log("Click on AddToCart");
        clickOnElement(addToCart);
    }

    public String getTextAfterAddToCart()
    {
        CustomListeners.test.log(Status.PASS,"Add To Cart text is displayed on page");
        Reporter.log("Add To Cart text is displayed on page");
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart()
    {
        CustomListeners.test.log(Status.PASS,"Click on shopping cart");
        Reporter.log("Click on shopping cart");
        clickOnElement(shoppingCart);
    }



}
