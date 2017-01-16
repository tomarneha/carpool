package test.selenium.sel.appium;

import Pages.OfferRidePage;
import test.AbstractBaseTests.TestBase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a Offer Ride page
 */
public class OfferRideTest extends TestBase {
	 

    private OfferRidePage offerridePage;
   
    @Override
    public String getName() {
        return "Offer Ride Page";
    }

  
    @BeforeTest
    @Override
    public void setUpPage() {
    	offerridePage = new OfferRidePage(driver);
    }

    /**
     * Ride is offered
     */
 
    @Test
    public void offerridePage(){
    	System.out.println("Offer Ride");
    	offerridePage.offeraride();
     //   Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
    }   
 
}
