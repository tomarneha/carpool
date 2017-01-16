package test.selenium.sel.appium;


import Pages.LogoutPage;
import test.AbstractBaseTests.TestBase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a login page
 */
public class LogoutTest extends TestBase {
	 

    private LogoutPage logoutPage;
   
    @Override
    public String getName() {
        return "Logout Page";
    }

    /**
     * Creates a login
     */
    @BeforeTest
    @Override
    public void setUpPage() {
        logoutPage = new LogoutPage(driver);
    }

    /**
     * Tests logging in with valid credentials by verifying if the login message is correct
     */
 
    @Test
    public void logoutPage() throws InterruptedException{
    	System.out.println("My Vehicle.");
    	logoutPage.logout();
     //   Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
    }
    
    
    }
    
 

