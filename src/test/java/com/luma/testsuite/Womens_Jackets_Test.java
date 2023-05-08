package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.Womens_Jackets_Page;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class Womens_Jackets_Test extends BaseTest {

    HomePage homepage ;
    Womens_Jackets_Page womenpage ;

    @BeforeMethod(alwaysRun = true)
    public void inIt()
    {
         homepage = new HomePage();
         womenpage = new Womens_Jackets_Page();

    }


    @Test(groups = {"sanity" , "regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException
    {
        Thread.sleep(2000);
        homepage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homepage.mouseHoverOnTops();
        Thread.sleep(2000);
        homepage.clickOnJackets();
        womenpage.selectProductNameFilter("Product Name");

        Assert.assertEquals(womenpage.getProductList1(),womenpage.getProductList2());
//        womenpage.selectProductNameFilter("Price");
//        Assert.assertEquals(womenpage.getProductPriceList1(),womenpage.getProductPriceList2());
    }
    @Test(groups = {"smoke" , "regression"})
    public void verifyTheSortByPriceFilter() throws InterruptedException
    {
        Thread.sleep(2000);
        homepage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homepage.mouseHoverOnTops();
        Thread.sleep(2000);
        homepage.clickOnJackets();
        womenpage.selectProductNameFilter("Price");
        Assert.assertEquals(womenpage.getProductPriceList1(),womenpage.getProductPriceList2());

    }
}
