package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    HomePage homePage ;
    MenPage menPage ;
    ShoppingCartPage shoppingCart ;

    @BeforeMethod(alwaysRun = true)
    public void inIt()
    {
         homePage = new HomePage();
         menPage = new MenPage();
         shoppingCart = new ShoppingCartPage();

    }

    @Test(groups = {"smoke" , "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException
    {
        Thread.sleep(2000);
        homePage.mouseHoverOnMenMenu();
        homePage.mouseHoverOnBottom();
        homePage.clickOnPant();
        menPage.mouseHoverOnCronusYogaPant();
        menPage.clickOnSize();
        menPage.clickOnColor();
        menPage.clickOnAddToCart();
        Assert.assertEquals(menPage.getTextAfterAddToCart(),"You added Cronus Yoga Pant to your shopping cart.");
        menPage.clickOnShoppingCart();
        //Assert.assertEquals(shoppingCart.getShoppingCart(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCart.getCronusYogaPantText(),"Cronus Yoga Pant");
        Assert.assertEquals(shoppingCart.getSizeText(),"32");
        Assert.assertEquals(shoppingCart.getColorText(),"Black");

    }
}
