package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlisteners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {


    //   By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;

    public void clickOnProductGear() {
        clickOnElement(overnightDuffle);
        CustomListeners.test.log(Status.PASS, "OvernightDuffle" + overnightDuffle);
    }
}
