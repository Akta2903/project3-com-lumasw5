package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    By tops1 = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;


    public void mouseHoverOnWomenMenu()
    {
       // waitUntilVisibilityOfElementLocated(womenMenu,20);

        CustomListeners.test.log(Status.PASS,"Mouse hover on WomenMenu");
        Reporter.log("Mouse hover on WomenMenu in topMenu");
        mouseHoverToElement(womenMenu);

    }

    public void mouseHoverOnTops()
    {
        waitUntilVisibilityOfElementLocated(tops1,20);

        CustomListeners.test.log(Status.PASS,"Mouse hover on tops ");
        Reporter.log("Mouser hover on tops ");
        mouseHoverToElement(tops);
    }

    public void clickOnJackets()
    {
        CustomListeners.test.log(Status.PASS,"Click on jackets");
        Reporter.log("Click on jackets");
        clickOnElement(jackets);
    }

    public void mouseHoverOnMenMenu()
    {
       // waitUntilVisibilityOfElementLocated(menMenu,20);


        CustomListeners.test.log(Status.PASS,"Mouse hover on MenMenu");
        Reporter.log("Mouse hover on MenMenu in topMenu");

        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom()
    {
       // waitUntilVisibilityOfElementLocated(bottomMenu,20);
        CustomListeners.test.log(Status.PASS,"Mouse hover on bottomMenu");
        Reporter.log("Mouse hover on bottom in topMenu");

        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPant()
    {
        CustomListeners.test.log(Status.PASS,"Click on pants");
        Reporter.log("Click on pants");

        clickOnElement(pants);
    }

    public void mouseHoverOnGearMenu()
    {
        CustomListeners.test.log(Status.PASS,"Mouse hover on GearMenu");
        Reporter.log("Mouse hover on GearMenu in topMenu");

        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags()
    {
        CustomListeners.test.log(Status.PASS,"Click on bags");
        Reporter.log("Click on bags");
        clickOnElement(bags);
    }

}
