package test.selenium.sel.appium;

import Pages.MyOffers;
import test.AbstractBaseTests.TestBase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * Tests for a Profile page
 */
public class MyOffersTest extends TestBase {
	 

    private MyOffers myOffers;
   
    @Override
    public String getName() {
        return "My Offers Page";
    }

   
    @BeforeTest
    @Override
    public void setUpPage() {
    	myOffers = new MyOffers(driver);
    }

    /**
     * Profile page updated with valid data
     * @throws InterruptedException 
     */
    
    
    
 /*
    @Test(priority=1)
    public void updateprofilewithblank() throws InterruptedException{
    	System.out.println("My Offers");
        myOffers.updateprofilewithblank();
        Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
    }
 */
    
  @Test
    public void myOffers() throws InterruptedException{
    	System.out.println("My offers");
    	myOffers.updateprofile();
       // Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
    }
  
    
   
    
 
}
