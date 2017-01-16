package test.selenium.sel.appium;

import Pages.HomePage;

import test.AbstractBaseTests.TestBase;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Tests for a Profile page
 */
public class HomeTest extends TestBase {

	private HomePage homePage;

	@Override
	public String getName() {
		return "Home Page";
	}

	@BeforeTest
	@Override
	public void setUpPage() {
		homePage = new HomePage(driver);
	}

	/**
	 * Profile page updated with valid data
	 */

	/*
	 * 
	 * @Test(priority=1) public void updateprofilewithblank(){
	 * System.out.println("updateprofilewithblank");
	 * homePage.updateprofilewithblank();
	 * Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE); }
	 */

	@Test
	public void updateprofile() {
		System.out.println("Update Profile");
		homePage.updateprofile();
		// Assert.assertEquals(loginPage.getMessage(), LOGIN_SUCCESS_MESSAGE);
	}

}
