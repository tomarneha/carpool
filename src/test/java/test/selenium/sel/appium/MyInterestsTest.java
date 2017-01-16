package test.selenium.sel.appium;

import Pages.MyInterestsPage;
import test.AbstractBaseTests.TestBase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a My Vehicle page
 */
public class MyInterestsTest extends TestBase {
	 

    private MyInterestsPage myinterestsPage;
   
    @Override
    public String getName() {
        return "MyVehicle Page";
    }

    
    @BeforeTest
    @Override
    public void setUpPage() {
    	myinterestsPage = new MyInterestsPage(driver);
    }

    /**
    My Interests display 
     */
 
    @Test
    public void myinterestsPage() throws InterruptedException{
    	System.out.println("My Interests");
    	myinterestsPage.updateinfo();
     //   Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
    }
    
    
   
    
 
}
