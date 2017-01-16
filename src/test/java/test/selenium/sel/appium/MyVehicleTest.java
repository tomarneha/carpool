package test.selenium.sel.appium;

import Pages.MyVehiclePage;
import test.AbstractBaseTests.TestBase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a My Vehicle page
 */
public class MyVehicleTest extends TestBase {
	 

    private MyVehiclePage myvehiclePage;
   
    @Override
    public String getName() {
        return "MyVehicle Page";
    }

    
    @BeforeTest
    @Override
    public void setUpPage() {
    	myvehiclePage = new MyVehiclePage(driver);
    }

    /**
    Vehicle Info display 
     */
 
    @Test
    public void myvehiclePage() throws InterruptedException{
    	System.out.println("My Vehicle.");
    	myvehiclePage.updateinfo();
     //   Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
    } 
 
}
